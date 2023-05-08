package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MenuDeInicioController {
	@FXML
	private Button btnCombate;
	@FXML
	private Button btnSalir;
	
	@FXML
	public void combatir(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Combate.fxml"));
			
				Parent root = loader.load();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				Stage stage2 = (Stage)this.btnCombate.getScene().getWindow();
				stage.setResizable(false);
				stage.setTitle("Combate");
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage2.close();
				stage.showAndWait();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	@FXML
	public void volverAlLogin(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Inicio.fxml"));
			
				Parent root = loader.load();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				Stage stage2 = (Stage)this.btnSalir.getScene().getWindow();
				stage.setResizable(false);
				stage.setTitle("Pokemon.exe");
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage2.close();
				stage.showAndWait();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
