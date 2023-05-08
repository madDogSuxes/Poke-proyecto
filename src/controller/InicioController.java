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

import crud.UsuarioCrud;
import javafx.event.ActionEvent;

import javafx.scene.control.ToggleButton;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class InicioController implements Initializable {

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
	@FXML
	public Text txtError;

	public Text getTxtError() {
		return txtError;
	}

	public void setTxtError(Text txtError) {
		this.txtError = txtError;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtError.setVisible(false);
	}

	@FXML
	public void registrarse(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/VentanaDeRegistro.fxml"));

			Parent root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage2 = (Stage) this.btnRegistro.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Ventaja de registro");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage2.close();
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void verContraseña(ActionEvent event) {
		// Recuerda hacerlo
	}

	public void loguearse() {

		if ((textField1.getText().length() != 0) && (passwordField1.getText().length() != 0)) {
			txtError.setVisible(false);

			UsuarioCrud.comprobarDatos(textField1.getText(), passwordField1.getText());
			
			if (UsuarioCrud.obtenerCambioDeVentana() == true) {
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
			}else if (UsuarioCrud.obtenerCambioDeVentana() == false) {
				txtError.setVisible(true);
			}
		} else{
			txtError.setVisible(true);
		}
	}
}
