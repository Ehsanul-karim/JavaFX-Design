package com.example.practiceonjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController {
    private void go(ActionEvent e, String fxml) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
            stage.show();
        }catch(Exception ex){ ex.printStackTrace(); }
    }

    @FXML void openLayoutDemo(ActionEvent e){ go(e, "layout_demo.fxml"); }
    @FXML void openEventDemo(ActionEvent e){ go(e, "event_demo.fxml"); }
    @FXML void openControlsDemo(ActionEvent e){ go(e, "controls_demo.fxml"); }
    @FXML void openDataPassingEntry(ActionEvent e){ go(e, "data_passing_entry.fxml"); }
    @FXML void openImageViewDemo(ActionEvent e){ go(e, "imageview_demo.fxml"); }
    @FXML void openTableDemo(ActionEvent e){ go(e, "table_demo.fxml"); }
    @FXML void openProgressDemo(ActionEvent e){ go(e, "progress_demo.fxml"); }
    @FXML void openSliderSpinnerDemo(ActionEvent e){ go(e, "slider_spinner_demo.fxml"); }
    @FXML void openListViewDemo(ActionEvent e){ go(e, "listview_demo.fxml"); }
    @FXML void openTreeViewDemo(ActionEvent e){ go(e, "treeview_demo.fxml"); }
    @FXML void openMenuBarDemo(ActionEvent e){ go(e, "menubar_demo.fxml"); }
    @FXML void openAlertsDemo(ActionEvent e){ go(e, "alerts_demo.fxml"); }
    @FXML void openFileChooserDemo(ActionEvent e){ go(e, "filechooser_demo.fxml"); }
}
