package src.controllers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import src.Main;

public class SupportController {
    private Main mainApp;
    private VBox layout;

    public SupportController(Main mainApp) {
        this.mainApp = mainApp;
        layout = new VBox(10);

        TextArea messageArea = new TextArea();
        messageArea.setPromptText("Type your message here...");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String message = messageArea.getText();
            // Logic to send the message to support (for now, just print to console)
            System.out.println("Support Message: " + message);
            messageArea.clear(); // Clear the input after sending
        });

        layout.getChildren().addAll(new Label("Support"), messageArea, sendButton);
    }

    public VBox getLayout() {
        return layout;
    }
}
