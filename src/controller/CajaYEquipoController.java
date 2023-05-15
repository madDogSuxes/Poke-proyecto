package controller;

import javafx.scene.control.Button;
import javafx.event.*;
import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import pokemone.Pokemon;

public class CajaYEquipoController {
	
	@FXML
	private Button btnVolver;
	@FXML
	private TableView<Pokemon> tableview1;
	@FXML
	private TableView<Pokemon> tableview2;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	@FXML
	public void volverAMenu(ActionEvent event) throws IOException {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			System.out.println("Retrocediendo al Log-in.");
	        scene = new Scene(root, 600, 331);
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setTitle("Menu de inicio");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
