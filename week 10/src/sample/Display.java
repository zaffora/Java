package sample;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
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
import javax.swing.*;
import javafx.scene.control.Button;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Display implements Initializable {
@FXML
public ListView<String> listView = new ListView<>();
Student[] studentList = new Student[1000];
public Button submit;
public TextArea grades;



@Override
public void initialize(URL location, ResourceBundle resources) {



    // adds the students in the studentList array to the ListView
    for (Student each: Course.students) {
        listView.getItems().add(each.toString());
    }

}

public void submitGrades(){

}



}
