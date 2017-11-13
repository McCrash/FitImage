package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage stage) throws Exception {
		BorderPane pane = new BorderPane();
		ImageView img = new ImageView(
				"http://weknowyourdreams.com/images/forest/forest-13.jpg");
		pane.setCenter(img);
		pane.setStyle("-fx-background-color: #000000;");
		

		Scene scene = new Scene(pane);
		img.fitWidthProperty().bind(stage.widthProperty());
		img.setPreserveRatio(true);
		stage.setScene(scene);
		
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
