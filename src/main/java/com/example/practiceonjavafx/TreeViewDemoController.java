package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TreeItem;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class TreeViewDemoController {
    @FXML private TreeView<String> tree;
    @FXML private Label lblNode;

    @FXML
    public void initialize(){
        TreeItem<String> root = new TreeItem<>("Categories");
        TreeItem<String> tech = new TreeItem<>("Technology");
        tech.getChildren().addAll(new TreeItem<>("AI"), new TreeItem<>("IoT"));
        TreeItem<String> sport = new TreeItem<>("Sports");
        sport.getChildren().addAll(new TreeItem<>("Football"), new TreeItem<>("Cricket"));
        root.getChildren().addAll(tech, sport);
        root.setExpanded(true);
        tree.setRoot(root);

        tree.getSelectionModel().selectedItemProperty().addListener((o,ov,nv)-> {
            if (nv != null) lblNode.setText("Selected: " + nv.getValue());
        });
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
