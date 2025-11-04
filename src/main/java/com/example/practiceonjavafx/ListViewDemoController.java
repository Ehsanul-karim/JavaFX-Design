package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;

public class ListViewDemoController {
    @FXML private ListView<String> list;
    @FXML private Label lblSelected;

    @FXML
    public void initialize(){
        list.setItems(FXCollections.observableArrayList("Apple","Banana","Mango","Orange","Grapes"));
        list.getSelectionModel().selectedItemProperty().addListener((o,ov,nv)-> lblSelected.setText("Selected: " + nv));
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
