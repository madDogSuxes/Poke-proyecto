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

public class CombateController {
	@FXML
	private Button btnVolver;

	
	@FXML
	
	
	
	public void volverAlMenu(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/MenuDeInicio.fxml"));
			
				Parent root = loader.load();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				Stage stage2 = (Stage)this.btnVolver.getScene().getWindow();
				stage.setResizable(false);
				stage.setTitle("Menu de inicio");
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage2.close();
				stage.showAndWait();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
