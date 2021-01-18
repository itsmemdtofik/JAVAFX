

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class JavaFxEvent extends Application {

    Label myLabel;

    public static void main(String[] args) {
        launch(args);
    }

    /* Override the start method */

    public void start(Stage myStage) {

        myStage.setTitle("Java FX Application");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);
        myLabel = new Label("Press a Button");
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        /* Handle the event */
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Pressed Up");
            }
        });
        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Pressed Down");
            }
        });
        rootNode.getChildren().addAll(btnUp, btnDown, myLabel);
        myStage.show();

    }

}