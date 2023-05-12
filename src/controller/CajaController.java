package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;

public class CajaController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	public void volverAMenu(ActionEvent event) throws IOException {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			System.out.println("Retrocediendo al Log-in.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Pokemon.exe");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
