package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import crud.CapturaCrud;
//import crud.CapturaCrud;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.stage.Stage;
import pokemone.Pokemon;

public class CapturaController {
	@FXML
	private Button btnCapturar;
	@FXML
	private TextField txtMote;
	@FXML
	private TextField txtMote2;
	@FXML
	private Text txtMote3;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnVolver;
	@FXML
	private Button btnSi;
	@FXML
	private Button btnNo;
	@FXML
	private ImageView imgPokemonEncontrado;

	private Stage stage;
	private Scene scene;
	private Parent root;

	protected boolean capturaRealizada;

	int pokeBall;

	public void initialize() {
		btnSi.setVisible(false);
		btnNo.setVisible(false);
		txtMote.setVisible(false);
		txtMote2.setVisible(false);
		txtMote3.setVisible(false);
	}

	@FXML
	public void capturarPokemon(ActionEvent event) {

		String mote = null;

		int probabilidadDeCaptura = (int) (Math.random() * 3) + 1;

		if (probabilidadDeCaptura != 1) {
			capturaRealizada = true;
			imgPokemonEncontrado.setVisible(false);
			System.out.println("Has capturado un pokemon.");
			pokeBall--;
			btnSi.setVisible(true);
			btnNo.setVisible(true);
			txtMote.setVisible(true);

			if (capturaRealizada == true) {
				txtMote2.setVisible(false);
				btnNo.setVisible(true);
				btnSi.setVisible(true);
				txtMote.setVisible(true);
				txtMote2.setVisible(false);
				txtMote3.setVisible(true);
				guardarMote(event);
			} else {
				noPonerMote(event);
			}
		} else {
			System.out.println("No has capturado ningún pokemon. ¡Sigue buscando!");
			btnSi.setVisible(false);
			btnNo.setVisible(false);
			txtMote.setVisible(false);
			txtMote2.setVisible(false);
			txtMote3.setVisible(false);
		}
	}

	@FXML
	public void buscarPokemon(ActionEvent event) {

		Pokemon p = CapturaCrud.buscarPokemon();

		File file = new File(p.getImgDeFrente());

		Image image = new Image(file.toURI().toString());

		imgPokemonEncontrado.setImage(image);
	}

	public void volverAMenu(Event event) throws IOException {
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
	}

	public void siPonerMote(Event event) {
		txtMote2.setVisible(true);
		Pokemon.ponerMote();
	}

	public void noPonerMote(Event event) {
		txtMote2.setVisible(false);
		Pokemon.noP0nerMote(null);
	}

	public void guardarMote(Event event) {
		siPonerMote(event);
	}
}
