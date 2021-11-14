package com.souls_death_tracker.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SDTController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Pain Zone!");
    }
}
