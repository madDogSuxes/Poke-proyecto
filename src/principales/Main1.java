package principales;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * Esta clase es el Main que hace que la aplicación Pokemon encienda
 * @author Miguel y Jesus
 */

public class Main1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../vistas/Inicio.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Pokemon.exe");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);
	}

}
