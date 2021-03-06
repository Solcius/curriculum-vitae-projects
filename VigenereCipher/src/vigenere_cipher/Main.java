package vigenere_cipher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
		
		@SuppressWarnings("unused")
		Controller controller = new Controller();
		
		primaryStage.setTitle("Vigenere cipher");
		primaryStage.getIcons().add(new Image("Java-icon.png"));
		primaryStage.setScene(new Scene(root, 1200, 700));
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
