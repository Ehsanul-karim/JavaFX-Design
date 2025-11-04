package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class AlertsDemoController {
    @FXML void showInfo(){ new Alert(Alert.AlertType.INFORMATION, "This is an info alert").showAndWait(); }
    @FXML void showWarn(){ new Alert(Alert.AlertType.WARNING, "This is a warning").showAndWait(); }
    @FXML void showError(){ new Alert(Alert.AlertType.ERROR, "This is an error").showAndWait(); }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
