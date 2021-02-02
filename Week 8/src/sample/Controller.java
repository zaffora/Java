package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
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
import javafx.fxml.Initializable;

import javax.print.attribute.standard.Finishings;

public class Controller implements Initializable {

    @FXML
    private ListView<String> scenceList = new ListView<>();

    static ArrayList<Student> roster = new ArrayList<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //ListView listView = new ListView<>();
        roster.add(new Student("John", 3.5, 700000001, 0));
        roster.add(new Student("Jane", 3.2, 700000011, 0));
        roster.add(new Student("Mike", 3.9, 700000012, 1));
        roster.add(new Student("Mary", 4.0, 700000013, 2));
        roster.add(new Student("Joseph", 3.1, 700000002, 3));

        //ListView listView = new ListView<>();

        for (Student each: roster) {
            scenceList.getItems().add(each.toString());
        }

    }
}
