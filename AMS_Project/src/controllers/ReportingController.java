package src.controllers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import src.Main;

public class ReportingController {
    private Main mainApp;
    private VBox layout;

    public ReportingController(Main mainApp) {
        this.mainApp = mainApp;
        layout = new VBox(10);

        Label titleLabel = new Label("Reporting Page");
        layout.getChildren().add(titleLabel);

        // Add other reporting UI components as needed

        Button backButton = new Button("Back to Login");  // Use loadLoginPage() to go back to the login
        backButton.setOnAction(e -> mainApp.loadLoginPage());
        layout.getChildren().add(backButton);
    }

    public VBox getLayout() {
        return layout;
    }
}
