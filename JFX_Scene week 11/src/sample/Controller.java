package sample;
import javafx.event.ActionEvent;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private String[] flagTitles = {"Canada", "China", "Denmark",
            "France", "Germany", "India", "Norway", "United Kingdom",
            "United States of America"};

    @FXML

    // create a list view to show the imformation for categories
    private ListView<Category> nameList = new ListView<>();

    @FXML
    private GridPane gp = new GridPane();

    @FXML
    Label categoryid = new Label();
    @FXML
    TextField categoryBox = new TextField();
    @FXML
    Button createButton = new Button();
    @FXML
    Button updateButton  = new Button();
    @FXML
    Button deleteButton = new Button();



    @FXML
    // button action to load another window to show the category list.
    public void pressButton (ActionEvent event) {
        System.out.println("Hellow world");
        try {

            Stage secondStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Deno2.fxml"));
            secondStage.setTitle("FXML Welcome");
            secondStage.setScene(new Scene(root));
            secondStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //get the Category list from database
    ArrayList<Category> list = DataAccess.GetCategories();
    //build an Observable list for list view.
    ObservableList<Category> view = FXCollections.observableArrayList(list);

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        nameList.setItems(view);
    }

    @FXML
    public void handleMouseClick(MouseEvent arg0) {
        if (nameList.getSelectionModel().getSelectedIndex() != -1) {

            Category cat = nameList.getItems().get(nameList.getSelectionModel().getSelectedIndex());

            categoryid.setText(String.valueOf(cat.category_id));
            categoryBox.setText(cat.category);


        }
    }

    @FXML
    public void UpdateCatory(ActionEvent e){

        int id =  Integer.parseInt(categoryid.getText());
        String category = categoryBox.getText();

        Category cat = new Category(id, category);
      try{
        DataAccess.UpdateCategory(cat);}
      catch(Exception err){
          err.printStackTrace();
      }

    }

    @FXML
    public void CreateNewCategory(ActionEvent e){

        String category = categoryBox.getText();
        try{
            DataAccess.CreateCategory(category);}
        catch(Exception err){
            err.printStackTrace();
        }
    }



}

