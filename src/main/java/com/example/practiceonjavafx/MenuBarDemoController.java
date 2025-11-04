package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class MenuBarDemoController {
    @FXML private Label lblStatus;

    @FXML void newFile(){ lblStatus.setText("Status: New clicked"); }
    @FXML void openFile(){ lblStatus.setText("Status: Open clicked"); }
    @FXML void exitApp(){ System.exit(0); }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
