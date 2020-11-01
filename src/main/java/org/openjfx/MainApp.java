package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        System.setProperty("prism.lcdtext", "false");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        Parent root = loader.load();

        //Now we have access to getController() through the instance... don't forget the type cast
        FXMLController fXMLController = (FXMLController)loader.getController();


		Circle circle = new Circle(160, 40, 25, Color.RED);
		fXMLController.setCircle(circle);
		Group group = new Group(circle, root);
        Scene scene = new Scene(group);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
