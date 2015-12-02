package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane {
	Media media;
	MediaPlayer mediaPlayer;
	MediaView mediaView;
	Pane pane;
	Box box;

	public Player(String file) {
		media = new Media(file);
		mediaPlayer = new MediaPlayer(media);
		mediaView = new MediaView(mediaPlayer);
		pane = new Pane();
		pane.getChildren().add(mediaView);
		setCenter(pane);
		box = new Box(mediaPlayer);
		setBottom(box);
		setStyle("-fx-background-color: #bfc2c7");
		mediaPlayer.play();
	}
	

}
