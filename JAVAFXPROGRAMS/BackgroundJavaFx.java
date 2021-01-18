/* Java program to set a fill for the background of a container */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;

import java.io.*;

import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.paint.*;

public class BackgroundJavaFx extends Application {


    public void start(Stage stage) {

        try {

            /* set title for the stage */
            stage.setTitle("creating Background");

            /* create a label */
            Label label = new Label("Name : ");

            /* create a text field */
            TextField textfield = new TextField();

            /* set preferred column count */
            textfield.setPrefColumnCount(10);

            /* create a button */
            Button button = new Button("OK");

            /* add the label, text field and button */
            HBox hbox = new HBox(label, textfield, button);

            /* set spacing */
            hbox.setSpacing(10);

            /* set alignment for the HBox */
            hbox.setAlignment(Pos.CENTER);

            /* create a scene */
            Scene scene = new Scene(hbox, 280, 280);

            /* create a background fill */
            BackgroundFill background_fill = new BackgroundFill(Color.PINK,
                    CornerRadii.EMPTY, Insets.EMPTY);

            /* create Background */
            Background background = new Background(background_fill);

            /* set background */
            hbox.setBackground(background);

            /* set the scene */
            stage.setScene(scene);

            stage.show();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    /* Main Method */
    public static void main(String args[]) {

        /* launch the application */
        launch(args);
    }
}
