package pokemonFX;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.PasswordField;

public class InicioController {
	
	@FXML
	private TextField TextField1;
	@FXML
	private PasswordField PasswordField1;
	@FXML
	private Button BtnLogin;
	@FXML
	private Button BtnRegistro;
	@FXML
	private ImageView Imagen2;
	@FXML
	private ImageView Imagen1;
	@FXML
	private ToggleButton toggle1;

	public void initialize() {
		
    }
	
	public void verContraseña() {
		if (toggle1.isSelected()) {
			TextField1.setText(PasswordField1.getText());
			PasswordField1.setVisible(false);
			TextField1.setVisible(true);
		} else {
			PasswordField1.setText(TextField1.getText());
			PasswordField1.setVisible(true);
			TextField1.setVisible(false);
		}
	}
}

