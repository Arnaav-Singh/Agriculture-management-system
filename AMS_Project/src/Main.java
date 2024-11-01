package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import src.controllers.LoginController;
import src.controllers.SignupController;
import src.controllers.ResourceManagementController;

public class Main extends Application {
    private Stage primaryStage;
    private BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        mainLayout = new BorderPane();
        loadLoginPage(); // Start with the Login page

        Scene scene = new Scene(mainLayout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Agriculture Management System");
        primaryStage.show();
    }

   public void loadLoginPage() {
    LoginController loginController = new LoginController();
    mainLayout.setCenter(loginController.getLayout());
}

public void loadSignupPage() {
    SignupController signupController = new SignupController();
    mainLayout.setCenter(signupController.getLayout());
}


    public void loadResourceManagementPage() {
        ResourceManagementController resourceManagementController = new ResourceManagementController(this);
        mainLayout.setCenter(resourceManagementController.getLayout());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
