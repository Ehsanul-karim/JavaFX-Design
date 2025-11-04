package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class ImageViewDemoController {
    @FXML private ImageView imageView;
    private int index = 0;
    private final String[] paths = {
        "pic1.png",
        "pic2.png"
    };

    @FXML
    public void initialize(){
        imageView.setImage(new Image(paths[0]));
    }

    @FXML
    void changeImage(){
        index = (index + 1) % paths.length;
        imageView.setImage(new Image(paths[index]));
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
