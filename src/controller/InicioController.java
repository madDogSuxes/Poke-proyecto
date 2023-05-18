package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.EventObject;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.EntrenadorCrud;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ToggleButton;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

/**
 * Clase controller que te muestra el Inicio de la aplicación Pokemon
 * @author Miguel y Jesús
 *
 */

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

	private Stage stage;
	private Scene scene;
	private Parent root;

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
	
	/**
	 * Método para ir a la ventana de registro
	 * @param event
	 */
	@FXML
	public void registrarse(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/VentanaDeRegistro.fxml")));
			scene = new Scene(root, 600, 331);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Ventana de registro");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para verContraseña
	 * @param event
	 */
	@FXML
	public void verContraseña(ActionEvent event) {

	}
	
	/**
	 * Método para loguearse
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void loguearse(Event event) throws IOException {

		if ((textField1.getText().length() != 0) && (passwordField1.getText().length() != 0)) {
			txtError.setVisible(false);

			EntrenadorCrud.comprobarDatos(textField1.getText(), passwordField1.getText());

			if (EntrenadorCrud.obtenerCambioDeVentana() == true) {
				try {
					root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/MenuDeInicio.fxml")));
					scene = new Scene(root, 600, 331);
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					stage.setTitle("Menu de inicio");
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (EntrenadorCrud.obtenerCambioDeVentana() == false) {
				txtError.setVisible(true);
			}
		} else {
			txtError.setVisible(true);
		}
	}
}
