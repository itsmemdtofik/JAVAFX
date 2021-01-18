/* A simple program to demonstrate page down and page up using javaFX*/

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class JavaFxButtonUpDown extends Application {

    Label resPonse;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {
        System.out.println("Application is starting...");
    }

    @Override
    public void start(Stage myStage) {

        myStage.setTitle("JavaFx Button and Events");
        FlowPane rootNode = new FlowPane(20, 20);
        Scene myScene = new Scene(rootNode, 400, 530);
        rootNode.setAlignment(Pos.CENTER);
        myStage.setScene(myScene);
        resPonse = new Label("Click on Button !");
        Button btnUp = new Button("UP");
        Button btnDown = new Button("Down");

        /*Handle the action event for the Button Up */
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                resPonse.setText("You pressed Up ");
            }
        });

        /* Handle the event for the Button Down */
        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                resPonse.setText("You pressed Down ");
            }
        });

        rootNode.getChildren().addAll(btnDown, resPonse, btnUp);
        myStage.show();


    }

    @Override
    public void stop() {
        System.out.println("Application is stopping... ");
    }
}
