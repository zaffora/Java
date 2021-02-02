package sample;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.SelectionMode;


public class Main extends Application {
    static ArrayList<Student> roster = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

// TODO: Make the necessary changes to display the class roster on screen using javafx rather then the console
      /*  roster.add(new Student("John", 3.5, 700000001, 0));
        roster.add(new Student("Jane", 3.2, 700000011, 0));
        roster.add(new Student("Mike", 3.9, 700000012, 1));
        roster.add(new Student("Mary", 4.0, 700000013, 2));
        roster.add(new Student("Joseph", 3.1, 700000002, 3)); */
Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
primaryStage.setTitle("week8");
primaryStage.setScene(new Scene(root));
primaryStage.show();

      /*  ListView listView = new ListView<>();

        for (Student each: roster) {
            listView.getItems().add(each);
        }

        HBox hBox = new HBox(listView);
        Scene scene = new Scene(hBox, 600, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
*/

    }

}
