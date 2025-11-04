package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class EventDemoController {
    @FXML private Button btnHello;
    @FXML private Label lblMessage;
    @FXML private TextField txtEnter;

    @FXML
    public void initialize(){
        lblMessage.setText("Press Enter after typing on TextField");
        btnHello.setOnAction(e -> lblMessage.setText("Hello from setOnAction!"));
        txtEnter.setOnAction(e -> lblMessage.setText("You pressed Enter with the Text " + txtEnter.getText()));
    }

    @FXML
    void backHome(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            // Or we can use
            // Stage stage = (Stage) lblMessage.getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
