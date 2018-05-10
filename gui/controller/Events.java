package controller;

import com.google.common.base.Throwables;
import example.Linkifier;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import utility.DataSourceFactory;
import utility.PrefixSelectionCustomizer;
import utility.TextAreaAppender;
import utility.ValidatorText;

import java.io.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.regex.Pattern;


public class Events implements Initializable {
	private final static Logger LOGGER = Logger.getLogger(Events.class.getName());

	// Global variables
	private RunService runService = new RunService();
	private Properties properties = new Properties();
	private Linkifier linkifier;


	// Define GUI elements. The values are automatically initialized by FXMLLoader.
	@FXML private Button buttonRun;
	@FXML private Button buttonExport;
	@FXML private TextField textHost;
	@FXML private TextField textPort;
	@FXML private TextField textDatabase;
	@FXML private TextField textServiceName;
	@FXML private TextField textSchema;
	@FXML private TextField textTableBlacklist;
	@FXML private TextField textUsername;
	@FXML private TextField textPassword;
	@FXML private ComboBox<String> comboBoxVendor;
	@FXML private TextArea textAreaConsole;
	@FXML private CheckBox checkBoxWindowsAuthentication;

	// Event handlers
	@FXML private void runAction() {
		// Terminate the current run, if running. Otherwise start it.
		if ("Terminate".equals(buttonRun.getText())) {
			runService.cancel();
			return;
		}

		// Clear the log window
		textAreaConsole.clear();

		// Get properties from the GUI and save them
		properties.setProperty("vendor", comboBoxVendor.getValue());
		properties.setProperty("host", textHost.getText());
		properties.setProperty("port", textPort.getText());
		properties.setProperty("database", textDatabase.getText());
		properties.setProperty("serviceName", textServiceName.getText());
		properties.setProperty("tableBlacklist", textTableBlacklist.getText());
		properties.setProperty("schema", textSchema.getText());
		properties.setProperty("username", textUsername.getText());
		properties.setProperty("integratedSecurity", checkBoxWindowsAuthentication.getText());
		writeProperties(properties);

		// Estimate the PK and FK
		runService.reset();
		runService.start();

		// Provide feedback to the user to wait
		runService.setOnRunning(event -> {
			buttonRun.setText("Terminate");
			buttonExport.setDisable(true);
		});

		// There are three plausible exit states. Cover them all.
		runService.setOnCancelled(event -> {
			buttonRun.setText("Estimate");
			LOGGER.info("Was the analysis taking too long?");
			LOGGER.info("Contact the developer at jan.motl@fit.cvut.cz");
		});
		runService.setOnFailed(event -> {
			buttonRun.setText("Estimate");
			LOGGER.severe(Throwables.getStackTraceAsString(runService.getException()));
			LOGGER.info("Something went wrong...");
			LOGGER.info("Please, send an email to the developer at jan.motl@fit.cvut.cz");
		});
		runService.setOnSucceeded(event -> {
			buttonRun.setText("Estimate");
			buttonExport.setDisable(false);
			LOGGER.info("Successfully finished the analysis.");
			LOGGER.info("You can now export the estimates.");
		});
	}

	@FXML private void exportAction() throws FileNotFoundException, UnsupportedEncodingException {
		FileChooser fileChooser = new FileChooser();
		String defaultFileName = ("".equals(textSchema.getText()) ? textDatabase.getText() : textSchema.getText());
		fileChooser.setInitialFileName(defaultFileName);
		fileChooser.getExtensionFilters().addAll(
				// If you change the description text, update the description in linkifier.export() as well
				new FileChooser.ExtensionFilter("GraphML (yEd)", "*.graphml"),
				new FileChooser.ExtensionFilter("TGF (yEd)", "*.tgf"),
				new FileChooser.ExtensionFilter("DDL (Oracle Data Modeler)", "*.ddl"),
				new FileChooser.ExtensionFilter("SQL with alter queries", "*.sql"),
				new FileChooser.ExtensionFilter("CSV for PK", "*.csv"),
				new FileChooser.ExtensionFilter("CSV for FK", "*.csv"),
				new FileChooser.ExtensionFilter("Decision justification for PK", "*.csv"),
				new FileChooser.ExtensionFilter("Decision justification for FK", "*.csv"));
		File file = fileChooser.showSaveDialog(buttonRun.getScene().getWindow());

		if (file != null) {
			linkifier.export(file, fileChooser.getSelectedExtensionFilter().getDescription());
		}
	}

	@FXML private void vendorAction() {
		if ("MySQL".equals(comboBoxVendor.getValue())) {
			textSchema.getParent().setVisible(false);
			textSchema.clear();
		} else {
			textSchema.getParent().setVisible(true);
		}

		if ("Oracle".equals(comboBoxVendor.getValue())) {
			textServiceName.getParent().setVisible(true);
		} else {
			textServiceName.getParent().setVisible(false);
			textServiceName.clear();
		}

		if ("Microsoft SQL Server".equals(comboBoxVendor.getValue())) {
			checkBoxWindowsAuthentication.getParent().setVisible(true);
			checkBoxWindowsAuthentication.setSelected(false);
		} else {
			checkBoxWindowsAuthentication.getParent().setVisible(false);
			textPassword.setDisable(false); // For other vendors, these must be permitted
			textUsername.setDisable(false);
		}
	}

	@FXML private void windowsAuthenticationAction() {
		if ("Microsoft SQL Server".equals(comboBoxVendor.getValue())) {
			if (checkBoxWindowsAuthentication.isSelected()) {
				textPassword.setDisable(true);
				textUsername.setDisable(true);
			} else {
				textPassword.setDisable(false);
				textUsername.setDisable(false);
			}
		}
	}

	// The initialize() method is automatically called after the FXML file has been loaded.
	// By this time, all the FXML fields are already initialized.
	// ResourceBundle rb localize the root object. null if the root object was not localized.
	@Override public void initialize(URL fxmlFileLocation, ResourceBundle rb) {

		// Setup logging into textArea (before any attempt to log anything)
		try {
			LogManager.getLogManager().readConfiguration(Events.class.getResourceAsStream("/logging.properties"));
		} catch (IOException|SecurityException|NullPointerException e) { // Eventual failure must not be fatal
			System.out.println("File 'logging.properties' was not found. Using system default.");
		}
		Logger globalLogger = Logger.getLogger("");
		globalLogger.addHandler(new TextAreaAppender(textAreaConsole));

		// Populate comboBoxes
		comboBoxVendor.getItems().addAll("Microsoft SQL Server", "MySQL", "Oracle", "PostgreSQL");

		// Read past setting. If no past setting is available, set it to demo properties.
		properties = readProperties();
		comboBoxVendor.setValue(properties.getProperty("vendor", "MySQL"));
		textHost.setText(properties.getProperty("host", "relational.fit.cvut.cz"));
		textPort.setText(properties.getProperty("port", "3306"));
		textDatabase.setText(properties.getProperty("database", "financial"));
		textSchema.setText(properties.getProperty("schema", ""));
		textServiceName.setText(properties.getProperty("serviceName", ""));
		textTableBlacklist.setText(properties.getProperty("tableBlacklist", ""));
		textUsername.setText(properties.getProperty("username", "guest"));
		if ("relational.fit.cvut.cz".equals(textHost.getText())) {
			textPassword.setText("relational"); // Publicly known read-only access to the demo database
		} else {
			textPassword.setText(properties.getProperty("password", "")); // We do not store the password, but if the user fills it in the properties file, read it
		}

		// When we hide a component, exclude the component from layouting
		textSchema.getParent().managedProperty().bind(textSchema.getParent().visibleProperty());
		textServiceName.getParent().managedProperty().bind(textServiceName.getParent().visibleProperty());
		checkBoxWindowsAuthentication.getParent().managedProperty().bind(checkBoxWindowsAuthentication.getParent().visibleProperty());

		// Hide schema combobox for MySQL
		if ("MySQL".equals(comboBoxVendor.getValue())) {
			textSchema.getParent().setVisible(false);
		}

		// Hide serviceName for all but Oracle
		if (!"Oracle".equals(comboBoxVendor.getValue())) {
			textServiceName.getParent().setVisible(false);
		}

		// Hide windowsAuthentication for all but Microsoft SQL Server
		if (!"Microsoft SQL Server".equals(comboBoxVendor.getValue())) {
			checkBoxWindowsAuthentication.getParent().setVisible(false);
		}

		// Add ability to select an item in a combobox with a key stroke
		PrefixSelectionCustomizer.customize(comboBoxVendor);

		// Add numeric validator
		ValidatorText.addNumericValidation(textPort, Integer.MAX_VALUE);

		// Add regex validator
		ValidatorText.addRegexValidation(textTableBlacklist);
	}


	private Properties readProperties() {
		Properties properties = new Properties();

		try (FileReader reader = new FileReader(new File("connection.properties"))) {
			properties.load(reader);
		} catch (IOException ignored) {
			// This can happen - someone deleted the file... We initialize the app with the default setting.
		}

		return properties;
	}

	private void writeProperties(Properties properties) {
		try (FileWriter fileWriter = new FileWriter(new File("connection.properties"))) {
			properties.store(fileWriter, "Linkifier's configuration file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	// Execute the calculation
	private class RunService extends Service<Void> {

		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws SQLException, InterruptedException {
					try (Connection connection = DataSourceFactory.getConfiguredDataSource(properties, textPassword.getText()).getConnection()) {
						if (isCancelled()) return null;

						LOGGER.info("Successfully connected to the database.");
						linkifier = new Linkifier(connection, properties.getProperty("schema"), Pattern.compile(properties.getProperty("tableBlacklist")));
						if (isCancelled()) return null;

						linkifier.estimatePk();
						if (isCancelled()) return null;

						linkifier.estimateFk();
						LOGGER.info("Estimated foreign key constraint count: " + linkifier.getFkCount());
					}

					return null;
				}
			};
		}
	}

}