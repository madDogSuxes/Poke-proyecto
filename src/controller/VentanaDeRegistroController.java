package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.EntrenadorCrud;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class VentanaDeRegistroController {

	@FXML
	private TextField textField1;
	@FXML
	private PasswordField passwordField1;
	@FXML
	private Button btnRegistro;
	@FXML
	private ImageView imagen2;
	@FXML
	private ImageView imagen1;
	@FXML
	private ToggleButton toggle1;
	@FXML
	private Button btnLogin;

	private Stage stage;
	private Parent root;
	private Scene scene;

	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void verContraseña() {
		// Recuerda hacerlo
	}

	public void registrarse(Event event) throws IOException {

		int pokeDollar;
		EntrenadorCrud.insertarDatos(textField1.getText(), passwordField1.getText(),
				pokeDollar = (int) (Math.random() * 201) + 800);
		System.out.println("PokeDollars asignados: " + pokeDollar);

		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("MenuDeInicio");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void volverAInicio(Event event) throws IOException {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Inicio.fxml")));
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon.exe");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
