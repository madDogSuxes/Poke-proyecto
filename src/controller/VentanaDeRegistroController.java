package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import crud.UsuarioCrud;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	public void verContraseña() {
		// Recuerda hacerlo
	}

	public void registrarse() {

		UsuarioCrud.insertarDatos(textField1.getText(), passwordField1.getText());

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/MenuDeInicio.fxml"));

			Parent root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage2 = (Stage) this.btnRegistro.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Menu de inicio");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage2.close();
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void volverAInicio() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Inicio.fxml"));

			Parent root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage2 = (Stage) this.btnLogin.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon.exe");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage2.close();
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
