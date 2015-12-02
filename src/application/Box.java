package application;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;

public class Box extends HBox{
	Slider time = new Slider();
	Slider volume = new Slider();
	Button button = new Button(">");
	Label label = new Label("Volume");
	MediaPlayer player;
	public Box(MediaPlayer play) {
		player = play;
		
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5 ,10 ,5 ,10));
		volume.setPrefWidth(70);
		volume.setMinWidth(30);
		volume.setValue(100);
		
	HBox.setHgrow(time, Priority.ALWAYS);
	button.setPrefWidth(30);
	getChildren().add(button);
	getChildren().add(time);
	getChildren().add(volume);
	
	
	}
	

}
