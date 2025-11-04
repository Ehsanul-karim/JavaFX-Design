package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ControlsDemoController {
    @FXML private RadioButton rMale, rFemale;
    @FXML private Label lblGender;
    @FXML private CheckBox chkReading, chkGaming, chkTravel;
    @FXML private Label lblHobbies;
    @FXML private ChoiceBox<String> choiceColor;
    @FXML private ComboBox<String> comboCountry;
    @FXML private Label lblCountry;
    @FXML private DatePicker datePicker;
    @FXML private Label lblDate;
    @FXML private ColorPicker colorPicker;
    @FXML private Label lblColored;

    @FXML
    public void initialize(){
        ToggleGroup group = new ToggleGroup();
        rMale.setToggleGroup(group);
        rFemale.setToggleGroup(group);
        rMale.setSelected(true);

        choiceColor.getItems().addAll("Red","Green","Blue");
        choiceColor.getSelectionModel().selectedItemProperty().addListener((o,ov,nv)->
            choiceColor.getScene().getRoot().setStyle("-fx-background-color: " + nv.toLowerCase() + ";")
        );

        comboCountry.getItems().addAll("Bangladesh","USA","UK","Japan");
        comboCountry.setOnAction(e -> lblCountry.setText("Selected: " + comboCountry.getValue()));

        datePicker.setOnAction(e -> {
            if (datePicker.getValue()!=null)
                lblDate.setText(datePicker.getValue().format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        });

        colorPicker.setOnAction(e -> {
            Color c = colorPicker.getValue();
            lblColored.setStyle(String.format("-fx-text-fill: rgb(%d,%d,%d);",
                    (int)(c.getRed()*255),(int)(c.getGreen()*255),(int)(c.getBlue()*255)));
        });
    }

    @FXML void showGender(){ lblGender.setText("Gender: " + (rMale.isSelected() ? "Male":"Female")); }

    @FXML void showHobbies(){
        List<String> list = new ArrayList<>();
        if (chkReading.isSelected()) list.add("Reading");
        if (chkGaming.isSelected()) list.add("Gaming");
        if (chkTravel.isSelected()) list.add("Traveling");
        lblHobbies.setText(String.join(", ", list));
    }

    @FXML
    void backHome(ActionEvent e){
        try{
            Stage stage = (Stage)((Control)e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("home.fxml")),900,700));
        }catch(Exception ex){ ex.printStackTrace(); }
    }
}
