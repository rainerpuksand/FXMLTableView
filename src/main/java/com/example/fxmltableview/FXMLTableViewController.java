package com.example.fxmltableview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLTableViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}