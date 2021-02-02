
import javafx.application.*;
import javafx.scene.*;
//import javafx.scene.control.cell.*;
import javafx.scene.control.Button;
import javafx.stage.*;


public class MyJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method s
		 Button btOK = new Button("OK");
		 Scene newScene = new Scene(btOK, 200, 300);
		 primaryStage.setTitle("The first Scene");
		 primaryStage.setScene(newScene);
		 primaryStage.show();
		 
		 Stage stage = new Stage();
		 stage.setTitle("the second stage");
		stage.setScene(new Scene( new Button("new stage"), 500, 200));
		stage.show();
		 
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
