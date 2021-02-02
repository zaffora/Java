package sample;
import java.sql.*;
import javafx.fxml.Initializable;
import java.io.IOException;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javax.print.attribute.standard.Finishings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import javafx.scene.*;

public class Controller implements Initializable{

    double rating=0;

    public RadioButton r4 = new RadioButton();
    public RadioButton r3 = new RadioButton();
    public RadioButton r2 = new RadioButton();
    public RadioButton rAll = new RadioButton();

    public ToggleGroup group = new ToggleGroup();

    public ListView list = new ListView();

    public reader bdReader = new reader();

    public ArrayList<database> aps4 = new ArrayList<>();
    public ArrayList<database> aps3 = new ArrayList<>();
    public ArrayList<database> aps2 = new ArrayList<>();




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        r4.setToggleGroup(group);
        r3.setToggleGroup(group);
        r2.setToggleGroup(group);
        rAll.setToggleGroup(group);

        aps4 = bdReader.GetCategories(4);
        aps3 = bdReader.GetCategories(3);
        aps2 = bdReader.GetCategories(2);


    }

    public void printList4(){

        list.getItems().clear();
        for (int e=0; e < 568; e++){
            list.getItems().add(aps4.get(e));
        }


    }

    public void printList3(){

        list.getItems().clear();
        for (int e=0; e < 83; e++){
            list.getItems().add(aps3.get(e).toString());
        }

    }

    public void printList2(){

        list.getItems().clear();
        for (int e=0; e < 12; e++){
            list.getItems().add(aps2.get(e).toString());
        }

    }

    public void printListAll(){
        list.getItems().clear();
        for (int e=0; e < 12; e++){
            list.getItems().add(aps2.get(e).toString());
        }
        for (int e=0; e < 83; e++){
            list.getItems().add(aps3.get(e).toString());
        }
        for (int e=0; e < 568; e++){
            list.getItems().add(aps4.get(e).toString());
        }

    }


}
