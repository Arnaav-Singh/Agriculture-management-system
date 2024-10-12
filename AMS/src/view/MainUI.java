package view;

import controller.DataController;
import controller.FarmerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {
    FarmerController farmerController = new FarmerController();
    DataController dataController = new DataController();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Agriculture Management System");

        // Farmer Registration UI
        VBox layout = new VBox();
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label regionLabel = new Label("Region:");
        TextField regionField = new TextField();

        Label contactLabel = new Label("Contact:");
        TextField contactField = new TextField();

        Button registerButton = new Button("Register Farmer");
        registerButton.setOnAction(e -> {
            farmerController.registerFarmer(nameField.getText(), regionField.getText(), contactField.getText());
            System.out.println("Farmer Registered: " + nameField.getText());
        });

        layout.getChildren().addAll(nameLabel, nameField, regionLabel, regionField, contactLabel, contactField, registerButton);

        // Scene
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
