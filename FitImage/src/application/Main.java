package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public AnchorPane pane;
	public Scene scene;


	
	public void start(Stage stage) throws Exception {
		// AnchorPane pane = new AnchorPane();
		// ImageView img = new
		// ImageView("http://weknowyourdreams.com/images/forest/forest-13.jpg");
		// pane.setCenter(img);

		/**
		 * carga la vista fxml y opcionalmente un controlador para inicializar
		 * algún componente sobre el panel mypane colocamos la vista
		 */

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Root.fxml"));

		loader.setController(new SetSize());
		pane = (AnchorPane) loader.load();

		scene = new Scene(pane);
		// refugees.fitWidthProperty().bind(refugees.getScene().getWindow().widthProperty());
		// refugees.setPreserveRatio(true);
		
		
		stage.setScene(scene);
		stage.show();
	}

	class SetSize {

		@FXML
		public ImageView refugees;

		@FXML
		public void initialize() {

			Stage thisStage = (Stage) refugees.getScene().getWindow();

			refugees.fitWidthProperty().bind(thisStage.widthProperty());
			refugees.setPreserveRatio(true);

			refugees.setEffect(new GaussianBlur(5));

		}
	}

	public static void main(String[] args) {
		launch(args);

	}
}
