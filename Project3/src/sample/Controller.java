package sample;

import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.fxml.*;

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
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.SelectionMode;
import javafx.fxml.Initializable;
import javax.print.attribute.standard.Finishings;
import javafx.scene.control.Button;
import javafx.scene.*;




public class Controller implements Initializable {

    public GridPane grid;
    public Button up,down,left,right;
    public Label player, obstacle1, obstacle2, obstacle3, obstacle4, goal;
    int row=0,column=0;

    Object p = new Object();
    Object o1 = new Object();
    Object o2 = new Object();
   Object o3 = new Object();
    Object o4 = new Object();
    Object g = new Object();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reader();
        } catch (IOException e) {
            e.printStackTrace();
        }

        grid.getChildren().remove(player);
        grid.add(player,p.y,p.x);

        grid.getChildren().remove(obstacle1);
        grid.add(obstacle1,o1.y,o1.x);

        grid.getChildren().remove(obstacle2);
        grid.add(obstacle2,o2.y,o2.x);

        grid.getChildren().remove(obstacle3);
        grid.add(obstacle3,o3.y,o1.x);

        grid.getChildren().remove(goal);
        grid.add(goal,g.y,g.x);

        grid.getChildren().remove(obstacle4);
        grid.add(obstacle4,o4.y,o4.x);
    }

    public void moveUp(){
        row--;
        grid.getChildren().remove(player);
        grid.add(player,column,row);
    }

    public void moveDown(){
        row++;
        grid.getChildren().remove(player);
        grid.add(player,column,row);
    }

    public void moveLeft(){
        column--;
        grid.getChildren().remove(player);
        grid.add(player,column,row);
    }

    public void moveRight(){
        column++;
        grid.getChildren().remove(player);
        grid.add(player,column,row);
    }

    public void reader() throws IOException {

        BufferedReader br = null;
        int studentCount = 0;
        String line = "";
        String[] objectDetails;

        try {
            br = new BufferedReader(new FileReader("game.csv"));

                br.readLine(); // skip the first line

            line = br.readLine(); // player
                objectDetails = line.split(",");
                // 0 = name
                // 1 = x
                // 2 = y
            p.setX(Integer.parseInt(objectDetails[1]));
            p.setY(Integer.parseInt(objectDetails[2]));

            line = br.readLine(); // obstacle
            objectDetails = line.split(",");
            // 0 = name
            // 1 = x
            // 2 = y
            o1.setX(Integer.parseInt(objectDetails[1]));
            o1.setY(Integer.parseInt(objectDetails[2]));

            line = br.readLine(); // obs 2
            objectDetails = line.split(",");
            // 0 = name
            // 1 = x
            // 2 = y
            o2.setX(Integer.parseInt(objectDetails[1]));
            o2.setY(Integer.parseInt(objectDetails[2]));

            line = br.readLine(); // obs 3
            objectDetails = line.split(",");
            // 0 = name
            // 1 = x
            // 2 = y
            o3.setX(Integer.parseInt(objectDetails[1]));
            o3.setY(Integer.parseInt(objectDetails[2]));

            line = br.readLine(); // obs 4
            objectDetails = line.split(",");
            // 0 = name
            // 1 = x
            // 2 = y
            o4.setX(Integer.parseInt(objectDetails[1]));
            o4.setY(Integer.parseInt(objectDetails[2]));

            line = br.readLine(); // goal
            objectDetails = line.split(",");
            // 0 = name
            // 1 = x
            // 2 = y
            g.setX(Integer.parseInt(objectDetails[1]));
            g.setY(Integer.parseInt(objectDetails[2]));



        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
