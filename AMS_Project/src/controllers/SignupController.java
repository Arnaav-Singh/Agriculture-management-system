package src.controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import src.services.UserService;

public class SignupController {
    private UserService userService;
    private TextField usernameField;
    private PasswordField passwordField;
    private Button signupButton;

    public SignupController() {
        userService = new UserService();
        signupButton.setOnAction(e -> signup());
    }

    private void signup() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (userService.addUser(username, password)) {
            showAlert("Success", "User registered successfully!");
        } else {
            showAlert("Error", "Username already exists.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
