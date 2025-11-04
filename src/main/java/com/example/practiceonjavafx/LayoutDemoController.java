package com.example.practiceonjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LayoutDemoController {
    @FXML
    void backHome(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
        }catch(Exception ex){ ex.printStackTrace(); }
    }
}
