package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javax.swing.*;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ResourceBundle;
import java.util.*;
import java.io.*;
import java.sql.*;


public class Controller implements Initializable{

    // variables for login scene
    public TextField password;
    public Button login;
    public Button loginAdmin;
    String userPassword;

    // hard coded passwords
    String admin="itnstudent";

    // Password hashing variables
    PasswordEncryptionService secure = new PasswordEncryptionService();
    byte[] salt;
    byte[] passwordHash;
    boolean auth;

    // variables for the standard interface
    public RadioButton r4 = new RadioButton();
    public RadioButton r3 = new RadioButton();
    public RadioButton r2 = new RadioButton();
    public RadioButton rAll = new RadioButton();
    public ToggleGroup group = new ToggleGroup();
    public ToggleGroup groupAdmin = new ToggleGroup();
    public ListView list = new ListView();
    public ArrayList<database> aps4 = new ArrayList<>();
    public ArrayList<database> aps3 = new ArrayList<>();
    public ArrayList<database> aps2 = new ArrayList<>();
    public MySQL bdReader = new MySQL();

    // variables for Admin scene
    public Button insertAdmin, modifyAdmin;
    public TextField insert, modifyName, modifyReview;
    public RadioButton allAdmin = new RadioButton();
    public RadioButton admin4 = new RadioButton();
    public RadioButton admin3 = new RadioButton();
    public RadioButton admin2 = new RadioButton();
    MySQL newR = new MySQL();
    MySQL modifyR = new MySQL();


    @Override
    public void initialize(URL location, ResourceBundle resources){

        // standard user radio button group
        r4.setToggleGroup(group);
        r3.setToggleGroup(group);
        r2.setToggleGroup(group);
        rAll.setToggleGroup(group);

        // Admin radio button group
        allAdmin.setToggleGroup(groupAdmin);
        admin2.setToggleGroup(groupAdmin);
        admin3.setToggleGroup(groupAdmin);
        admin4.setToggleGroup(groupAdmin);

        // sets the rating selection
        aps4 = bdReader.getCategories(4);
        aps3 = bdReader.getCategories(3);
        aps2 = bdReader.getCategories(2);



    }


    // prints 4 star apps
    public void printList4(){

        list.getItems().clear();
        for (int e=0; e < 568; e++){
            list.getItems().add(aps4.get(e));
        }


    }

    // prints 3 star apps
    public void printList3(){

        list.getItems().clear();
        for (int e=0; e < 83; e++){
            list.getItems().add(aps3.get(e).toString());
        }

    }

    // prints 2 star apps
    public void printList2(){

        list.getItems().clear();
        for (int e=0; e < 12; e++){
            list.getItems().add(aps2.get(e).toString());
        }

    }

    //prints all the apps to the list view
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

    // login for standard user
    public void login(){

            try {

                Stage secondStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("standard.fxml"));
                secondStage.setTitle("Final Project - Standard User");
                secondStage.setScene(new Scene(root, 900, 372));
                secondStage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }

    public void loginAdmin() throws InvalidKeySpecException, NoSuchAlgorithmException {

        boolean pass = secureLogin();

        if (pass == true){
            try {

                Stage thirdStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
                thirdStage.setTitle("Final Project - Admin");
                thirdStage.setScene(new Scene(root, 1000, 700));
                thirdStage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    // creates a new review
    public void newReview(){
        String values = insert.getText();
        newR.insert(values);
    }

    // changes an existing review
    public void modifyReview(){
        String name = modifyName.getText();
        String review = modifyReview.getText();
        modifyR.modify(name, review);
    }

    public boolean secureLogin() throws InvalidKeySpecException, NoSuchAlgorithmException {

        // setting the secure password
        try {
            salt = secure.generateSalt();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        userPassword = password.getText();

        passwordHash = secure.getEncryptedPassword(userPassword, salt);

        auth = secure.authenticate(userPassword, passwordHash, salt);

        return auth;
    }
}
