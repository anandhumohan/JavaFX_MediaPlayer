package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		String path = "/media/anandhu/E57D-ED7C/naanum/song.mp3";
		 
		Player player = new Player(new File(path).toURI().toString());
		Scene scene = new Scene(player, 720, 510, javafx.scene.paint.Color.BLACK);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
