
package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
///import javafx.scene.control.SelectionMode;

public class Demo2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws Exception {


       // String[] List = new String[100];

       // ObservableList<String> view = FXCollections.observableArrayList();

        //ObservableList<String> view = FXCollections.observableArrayList()
       // view.add("Ken DIng");

        Parent root = FXMLLoader.load(getClass().getResource("Deno2.fxml"));

        primaryStage.setTitle("Assignment 8");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
