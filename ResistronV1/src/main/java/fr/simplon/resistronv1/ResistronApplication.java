package fr.simplon.resistronv1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

/* Here we created the class Resistron Application to be able to connect scene builder with JavaFX and run
the application with the HMI.
 */
public class ResistronApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Resistron.fxml"));
        Stage stage = loader.load();
         stage.setTitle("Resistron");
            stage.show();

    }
}

