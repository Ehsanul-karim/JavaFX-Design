package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class ProgressDemoController {
    @FXML private TextField txtTarget;
    @FXML private Label lblSum;
    @FXML private ProgressBar progress;

    private int current = 0;

    @FXML
    void accumulate(){
        int target = 1;
        try{ target = Integer.parseInt(txtTarget.getText()); }catch(Exception ignored){}
        current++;
        lblSum.setText(String.valueOf(current));
        progress.setProgress(Math.min(1.0, (double)current / Math.max(target,1)));
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
