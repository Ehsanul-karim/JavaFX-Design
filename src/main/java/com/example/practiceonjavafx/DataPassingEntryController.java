package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class DataPassingEntryController {
    @FXML private TextField txtInput;

    @FXML
    void goNext(ActionEvent e){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("data_passing_display.fxml"));
            Parent root = loader.load();
            DataPassingDisplayController controller = loader.getController();
            controller.setData(txtInput.getText());
            Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
        }catch(Exception ex){ ex.printStackTrace(); }
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
