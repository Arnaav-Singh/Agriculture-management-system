package src.controllers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import src.Main;

import java.util.ArrayList;

public class RegisterController {
    private Main mainApp;
    private VBox layout;
    private ArrayList<String> registeredFarmers;

    public RegisterController(Main mainApp) {
        this.mainApp = mainApp;
        this.registeredFarmers = new ArrayList<>();
        layout = new VBox(10);
        
        TextField farmerNameField = new TextField();
        farmerNameField.setPromptText("Farmer Name");

        TextField farmerEmailField = new TextField();
        farmerEmailField.setPromptText("Farmer Email");

        Button registerButton = new Button("Register");
        registerButton.setOnAction(e -> {
            String name = farmerNameField.getText();
            String email = farmerEmailField.getText();
            if (!name.isEmpty() && !email.isEmpty()) {
                registeredFarmers.add(name + " - " + email);
                farmerNameField.clear();
                farmerEmailField.clear();
                System.out.println("Registered Farmers: " + registeredFarmers);
                // Optionally, show a success message
            }
        });

        layout.getChildren().addAll(new Label("Farmer Registration"), farmerNameField, farmerEmailField, registerButton);
    }

    public VBox getLayout() {
        return layout;
    }
}
