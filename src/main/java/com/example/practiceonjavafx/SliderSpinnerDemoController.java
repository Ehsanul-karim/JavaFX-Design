package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class SliderSpinnerDemoController {
    @FXML private Label lblFont;
    @FXML private Slider slider;
    @FXML private Spinner<Integer> spinner;
    @FXML private Label lblSpinnerVal;

    @FXML
    public void initialize(){
        lblFont.setStyle("-fx-font-size: 16px;");
        slider.valueProperty().addListener((o,ov,nv)-> lblFont.setStyle("-fx-font-size: " + nv.intValue() + "px;"));
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1));
    }

    @FXML
    void showSpinner(){ lblSpinnerVal.setText("Spinner: " + spinner.getValue()); }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
