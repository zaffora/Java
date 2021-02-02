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

public class ShowFlowPane extends Application {
	
	
	
	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FlowPane pane = new FlowPane();
		pane.setPadding( new Insets(11, 12, 13, 14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.getChildren().addAll(new Label("First Name"), new TextField(), new Label("MI:"));
		TextField tfMI = new TextField();
		tfMI.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMI, new Label("Last Name"), new TextField(), new Button("OK"));
		
		Scene scene = new Scene(pane);
		PrimaryStage.setTitle("Show Flow Pane");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
