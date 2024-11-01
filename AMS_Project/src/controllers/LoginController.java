package src.controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import src.services.UserService;

public class LoginController {
    private UserService userService;
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;

    public LoginController() {
        userService = new UserService();
        loginButton.setOnAction(e -> login());
    }

    private void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (userService.authenticateUser(username, password)) {
            showAlert("Success", "Login successful!");
            // Load next scene
        } else {
            showAlert("Error", "Invalid credentials.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
