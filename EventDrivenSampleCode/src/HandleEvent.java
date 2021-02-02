
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.*;

public class HandleEvent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		 
		Button btOK = new Button("OK");
		 btOK.setOnAction(new OKHandlerClass());
		 
		 
		 Button btCancel = new Button("Cancel");		 
		 btCancel.setOnAction(
				 
				new  EventHandler<ActionEvent>(){

						@Override
						public void handle(ActionEvent e) {
							// TODO Auto-generated method stub
							
							System.out.println("Cancel button is clicked");
						}
						
					});
		 
		 FlowPane pane = new FlowPane();
		 pane.getChildren().addAll(btOK, btCancel);
		 Scene newScene = new Scene(pane, 200, 300);
		 primaryStage.setTitle("button in a pane");
		 primaryStage.setScene(newScene);
		 primaryStage.show();
		 
		// pane.setRotate(45);
		 //pane.setStyle();
		   
		 
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	class OKHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("OK button is clicked");
		}
		
	}
	
	/*class CancelHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			
			// TODO Auto-generated method stub
			System.out.println("Cancel button is clicked");
			
		}
		
	}*/
}
