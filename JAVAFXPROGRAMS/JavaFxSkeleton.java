/* A simple javafx skeleton application */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class JavaFxSkeleton extends Application {
    Label myLabel;

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("Starting the application...");
    }

    @Override
    public void start(Stage myStage) {

        myStage.setTitle("A simple JavaFx Application");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myLabel = new Label("Javafx application");
        myStage.setScene(myScene);
        rootNode.getChildren().add(myLabel);
        /* If you want to remove the control from the scene you can use
         * that rootNode.getChildren.remove(myLable).*/
        myStage.show();

    }

    public void stop() {

        System.out.println("Stopping the Application..");
    }
}
