
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class RadioButtonFx extends Application {

    Label responseLabel;

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("Starting the Application...");
    }

    @Override
    public void start(Stage myStage) {
        try {
            myStage.setTitle("Java Aplication");
            FlowPane rootNode = new FlowPane(20, 20);
            rootNode.setAlignment(Pos.CENTER);
            Scene myScene = new Scene(rootNode, 220, 120);
            /* Set the scene on the stage. */
            myStage.setScene(myScene);
            /* Create a label that will report the selection. */
            responseLabel = new Label("");
            /* Create the radio buttons. */
            RadioButton rbTrain = new RadioButton("Train");
            RadioButton rbCar = new RadioButton("Car");
            RadioButton rbPlane = new RadioButton("Airplane");
            /* Create a toggle group. */
            ToggleGroup tg = new ToggleGroup();
            /* Add each button to a toggle group. */
            rbTrain.setToggleGroup(tg);
            rbCar.setToggleGroup(tg);
            rbPlane.setToggleGroup(tg);
            /* Handle action events for the radio buttons. */
            rbTrain.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    responseLabel.setText("Transport selected is train.");
                }
            });
            rbCar.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    responseLabel.setText("Transport selected is car.");
                }
            });
            rbPlane.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    responseLabel.setText("Transport selected is airplane.");
                }
            });
         /* Fire the event for the first selection. This causes
         that radio button to be selected and an action event for that button to
        occur. */
            rbTrain.fire();
            /*  Add the label and buttons to the scene graph. */
            rootNode.getChildren().addAll(rbTrain, rbCar, rbPlane, responseLabel);
            /* Show the stage and its scene. */
            myStage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void stop() {
        System.out.println("Stopping the application...");
    }

}
