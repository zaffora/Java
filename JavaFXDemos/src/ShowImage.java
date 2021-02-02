

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.image.*;

public class ShowImage extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		Image image = new Image("image/us.gif");
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageview2 = new ImageView(image);
		imageview2.setFitHeight(100);
		imageview2.setFitWidth(100);
		pane.getChildren().add(imageview2);
		
		ImageView imageview3 = new ImageView(image);
		imageview3.setRotate(90);
		pane.getChildren().add(imageview3);
		
		Scene scene = new Scene(pane);
		
		primaryStage.setTitle("show image demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
