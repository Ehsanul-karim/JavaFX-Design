package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.event.ActionEvent;

import java.io.File;

public class FileChooserDemoController {
    @FXML private ImageView imageView;

    @FXML
    void browse(ActionEvent e){
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.jpeg","*.gif"));
        File f = fc.showOpenDialog(stage);
        if (f != null) imageView.setImage(new Image(f.toURI().toString()));
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
