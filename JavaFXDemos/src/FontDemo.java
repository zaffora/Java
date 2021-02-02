

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
public class FontDemo extends Application {

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
	
	Pane pane = new StackPane();
	Circle circle =  new Circle();
	circle.setRadius(50);
	circle.setStroke(Color.BLACK);
	circle.setFill(new Color(0.5, 0.5, 0.5, 0.2));
	pane.getChildren().add(circle);
	
	//create label and set its properties
	Label label = new Label("Justin");
	label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
	pane.getChildren().add(label);
	
	Scene scene = new Scene(pane);
	primaryStage.setTitle("FontDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
	
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	

}
