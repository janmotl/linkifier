package controller;

import example.Linkifier;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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


public class Events implements Initializable {
	private final static Logger LOGGER = Logger.getLogger(Events.class.getName());

	// Global variables
	private Events.RunService runService = new Events.RunService();
	private Properties properties = new Properties();
	private Linkifier linkifier;


	// Define GUI elements. The values are automatically initialized by FXMLLoader.
	@FXML private Button buttonRun;
	@FXML private Button buttonExport;
	@FXML private TextField textHost;
	@FXML private TextField textPort;
	@FXML private TextField textDatabase;
	@FXML private TextField textSchema;
	@FXML private TextField textUsername;
	@FXML private TextField textPassword;
	@FXML private ComboBox<String> comboBoxVendor;
	@FXML private TextArea textAreaConsole;

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
		properties.setProperty("schema", textSchema.getText());
		properties.setProperty("username", textUsername.getText());
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
			runService.getException().printStackTrace();
			LOGGER.severe(runService.getException().getMessage());
			LOGGER.info("Something went wrong...");
			LOGGER.info("Contact the developer at jan.motl@fit.cvut.cz");
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
				new FileChooser.ExtensionFilter("GraphML (yEd)", "*.graphml"),
				new FileChooser.ExtensionFilter("TGF (yEd)", "*.tgf"),
				new FileChooser.ExtensionFilter("DDL (Oracle Data Modeler)", "*.ddl"),
				new FileChooser.ExtensionFilter("SQL with alter queries", "*.sql"),
				new FileChooser.ExtensionFilter("CSV for PK", "*.csv"),
				new FileChooser.ExtensionFilter("CSV for FK", "*.csv"));
		File file = fileChooser.showSaveDialog(buttonRun.getScene().getWindow());

		if (file != null) {
			linkifier.export(file, fileChooser.getSelectedExtensionFilter().getDescription());
		}
	}

	@FXML private void vendorAction() {
		if ("MySQL".equals(comboBoxVendor.getValue())) {
			textSchema.setDisable(true);
			textSchema.clear();
		} else {
			textSchema.setDisable(false);
		}
	}

	// The initialize() method is automatically called after the FXML file has been loaded.
	// By this time, all the FXML fields are already initialized.
	// rb localize the root object. null if the root object was not localized.
	@Override public void initialize(URL fxmlFileLocation, ResourceBundle rb) {

		// Setup logging into textArea (before any attempt to log anything)
		try {
			LogManager.getLogManager().readConfiguration(Events.class.getResourceAsStream("/logging.properties"));
		} catch (IOException e) {
			System.out.println("File 'logging.properties' was not found.");
			e.printStackTrace();
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
		textUsername.setText(properties.getProperty("username", "guest"));
		if ("relational.fit.cvut.cz".equals(textHost.getText())) {
			textPassword.setText("relational"); // Publicly known read-only access to the demo database
		} else {
			textPassword.setText(properties.getProperty("password", "")); // We do not store the password, but if the user fills it in the properties file, read it
		}

		// Disable schema combobox for MySQL
		if ("MySQL".equals(comboBoxVendor.getValue())) {
			textSchema.setDisable(true);
		}

		// Add ability to select an item in a combobox with a key stroke
		PrefixSelectionCustomizer.customize(comboBoxVendor);

		// Add numeric validator
		ValidatorText.addNumericValidation(textPort, Integer.MAX_VALUE);
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
						linkifier = new Linkifier(connection, properties.getProperty("schema"));
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