package src.controllers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import src.Main;

import java.util.Arrays;
import java.util.List;

public class ResourceManagementController {
    private Main mainApp;
    private VBox layout;

    public ResourceManagementController(Main mainApp) {
        this.mainApp = mainApp;
        layout = new VBox(10);

        Label titleLabel = new Label("Available Resources");
        List<String> resources = Arrays.asList("Subsidy: 1000", "Seeds: Wheat, Rice", "Fertilizers: NPK, Urea", "Equipment: Plow, Harvester");

        for (String resource : resources) {
            layout.getChildren().add(new Label(resource));
        }

        Button backButton = new Button("Back to Login");  // Use loadLoginPage() to go back to the login
        backButton.setOnAction(e -> mainApp.loadLoginPage());
        layout.getChildren().add(backButton);
    }

    public VBox getLayout() {
        return layout;
    }
}
