package com.example.practiceonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableDemoController {
    @FXML private TableView<Student> table;
    @FXML private TableColumn<Student, String> colName;
    @FXML private TableColumn<Student, String> colId;
    @FXML private TableColumn<Student, Double> colCgpa;
    @FXML private TextField txtName, txtId, txtCgpa;

    private final ObservableList<Student> data = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colCgpa.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
        table.setItems(data);
    }

    @FXML
    void addStudent(){
        try{
            data.add(new Student(txtName.getText(), txtId.getText(), Double.parseDouble(txtCgpa.getText())));
            txtName.clear(); txtId.clear(); txtCgpa.clear();
        }catch(Exception ex){ /* ignore parse errors for demo */ }
    }

    @FXML
    void backHome(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 900, 700));
    }
}
