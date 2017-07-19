package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

	// Main method is only for legacy support - Java 8 won't call it for a JavaFX application (it directly calls launch()).
	public static void main(String[] args) {
		launch(args);   // Tell Java to show the GUI
	}

	@Override
	// Define the GUI. Stage is OS window. Scene is the content of the window.
	// Note: All network connections are automatically closed on window closing - no need to handle it manually.
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));

		stage.setTitle("Linkifier");
		stage.getIcons().add(new Image("/img/network.png"));
		stage.setResizable(false);
		stage.setScene(new Scene(root));
		stage.show();
	}
}
