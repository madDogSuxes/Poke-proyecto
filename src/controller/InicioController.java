package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.ToggleButton;

import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class InicioController implements Initializable{
	@FXML
	private ImageView imagen1;
	@FXML
	private TextField textField1;
	@FXML
	private PasswordField passwordField1;
	@FXML
	private Button btnLogin;
	@FXML
	private ImageView imagen2;
	@FXML
	private Button btnRegistro;
	@FXML
	private ToggleButton toggle1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	@FXML
	public void registrarte(ActionEvent event) {
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/VentanaDeRegistro.fxml"));
		
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage2 = (Stage)this.btnRegistro.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Ventaja de registro");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage2.close();
			stage.showAndWait();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void verContraseña(ActionEvent event) {
		//Recuerda hacerlo
	}

}
