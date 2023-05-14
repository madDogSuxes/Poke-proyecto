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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import controller.CapturaController;
import crud.CapturaCrud;
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
	private Button btnAceptarMote;
	@FXML
	private ImageView imgPokemonEncontrado;
	@FXML
	private ImageView imgPokeball;

	private Stage stage;
	private Scene scene;
	private Parent root;

	protected boolean capturaRealizada;

	int pokeBall;

	public void initialize() {
		Date d = new Date();
        System.out.println(d);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
        System.out.println(simpleDateFormat.format(d) + ".log");
		
		imgPokeball.setVisible(false);
		btnSi.setVisible(false);
		btnNo.setVisible(false);
		btnAceptarMote.setVisible(false);
		txtMote.setVisible(false);
		txtMote2.setVisible(false);
		txtMote3.setVisible(false);
	}

	@FXML
	public void capturarPokemon(ActionEvent event) {

		int probabilidadDeCaptura = (int) (Math.random() * 3) + 1;

		if (probabilidadDeCaptura != 1) {
			capturaRealizada = true;
			imgPokemonEncontrado.setVisible(false);
			System.out.println("Has capturado un pokemon.");
			pokeBall--;
			imgPokeball.setVisible(true);
			btnAceptarMote.setVisible(false);
			btnSi.setVisible(true);
			btnNo.setVisible(true);
			txtMote.setVisible(true);
			txtMote2.setVisible(false);
			txtMote3.setVisible(true);

			if (btnSi != null) {
				txtMote2.setVisible(true);
				btnAceptarMote.setVisible(true);
			} else if (btnNo != null) {
			
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

		boolean buscarPokemon = true;

		Pokemon p = CapturaCrud.buscarPokemon();

		File file = new File(p.getImgDeFrente());

		Image image = new Image(file.toURI().toString());

		imgPokemonEncontrado.setImage(image);
		imgPokemonEncontrado.setVisible(true);
		imgPokeball.setVisible(false);
		btnSi.setVisible(false);
		btnNo.setVisible(false);
		btnAceptarMote.setVisible(false);
		txtMote.setVisible(false);
		txtMote2.setVisible(false);
		txtMote3.setVisible(false);

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
		btnAceptarMote.setVisible(true);
		Pokemon.ponerMote();
	}

	public void noPonerMote(Event event) {
		txtMote2.setVisible(false);
		btnAceptarMote.setVisible(false);
		Pokemon.noP0nerMote(null);
	}

	public void guardarMote(Event event) {
		siPonerMote(event);
	}
}
