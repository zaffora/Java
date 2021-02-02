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
import javafx.scene.control.Button;


public class Controller implements Initializable {

    public Button all, first, second, third, fourth;
    private String freshmen="\n \t Freshmen:", sophomore="\n \t Sophomores:", junior="\n \t Juniors:", senior="\n \t Seniors:", allClasses="\n \t All Classes";

    @FXML
    private ListView<String> sceneList = new ListView<>();

    static ArrayList<Student> roster = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        roster.add(new Student("John", 3.5, 700000001, 0));
        roster.add(new Student("Jane", 3.2, 700000011, 0));
        roster.add(new Student("Mike", 3.9, 700000012, 1));
        roster.add(new Student("Mary", 4.0, 700000013, 2));
        roster.add(new Student("Joseph", 3.1, 700000002, 3));
    }

    public void printAll(){
        sceneList.getItems().clear();
        sceneList.getItems().add(allClasses);
        for (Student each: roster) {
            sceneList.getItems().add(each.toString());
        }
    }

    public void printFreshmen(){
        sceneList.getItems().clear();
        sceneList.getItems().add(freshmen);
        for (int i=0; i < 5; i++){
            if (roster.get(i).getClasses() == 0){
                sceneList.getItems().add(roster.get(i).toString());
            }
        }

    }

    public void printSophomores(){
        sceneList.getItems().clear();
        sceneList.getItems().add(sophomore);
        for (int i=0; i < 5; i++){
            if (roster.get(i).getClasses() == 1){
                sceneList.getItems().add(roster.get(i).toString());
            }
        }
    }

    public void printJuniors(){
        sceneList.getItems().clear();
        sceneList.getItems().add(junior);
        for (int i=0; i < 5; i++){
            if (roster.get(i).getClasses() == 2){
                sceneList.getItems().add(roster.get(i).toString());
            }
        }
    }

    public void printSeniors(){
        sceneList.getItems().clear();
        sceneList.getItems().add(senior);
        for (int i=0; i < 5; i++){
            if (roster.get(i).getClasses() == 3){
                sceneList.getItems().add(roster.get(i).toString());
            }
        }
    }

}
