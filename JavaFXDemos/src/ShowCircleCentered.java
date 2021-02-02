
import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class ShowCircleCentered extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method s
		
		StackPane pane = new StackPane();
		Circle circle = new Circle();
		//circle.setCenterX(100);
		//circle.setCenterY(100);
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.BEIGE);

		 
		 //create pane 
		 pane.getChildren().add(circle);
		 
		 //need keep for all sample
		 Scene newScene = new Scene(pane, 200, 300);	
		 primaryStage.setTitle("button in a pane");
		 primaryStage.setScene(newScene);
		 primaryStage.show();
		 
		 
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
