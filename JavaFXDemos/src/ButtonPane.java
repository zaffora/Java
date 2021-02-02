
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class ButtonPane extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method s
		 Button btOK = new Button("OK");
		 StackPane pane = new StackPane();
		 pane.getChildren().add(btOK);
		 Scene newScene = new Scene(pane, 200, 300);
		 primaryStage.setTitle("button in a pane");
		 primaryStage.setScene(newScene);
		 primaryStage.show();
		 
		 pane.setRotate(45);
		 //pane.setStyle();
		 
		 
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
