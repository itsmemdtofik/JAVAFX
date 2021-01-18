/* A javafx list view program */

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewFx extends Application {

    Label responseLabel;

    public void init() {
        System.out.println("Starting Application...");
    }
    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage myStage) {
        try {

            myStage.setTitle("Android Application");
            FlowPane rootNode = new FlowPane(20, 20);
            rootNode.setAlignment(Pos.CENTER);
            Scene myScene = new Scene(rootNode, 300, 300);
            myStage.setScene(myScene);
            responseLabel = new Label("Select the Name:");
            Separator mySeparator = new Separator();
            mySeparator.setPrefWidth(180);

            /* Create a observable list */
            ObservableList<String> nameTypeList = FXCollections.observableArrayList("Allen", "Taufique", "Hafiz", "Danish",
                    "Ahad", "Hilay", "Zaheer", "Tauqeer", "Sufiyan", "Faizan","Kumar");
            /* Create a List View */
            ListView<String> myListView = new ListView<String>(nameTypeList);
            myListView.setPrefSize(300, 200);

            /* Get the list view selection model */
            MultipleSelectionModel<String> vModel = myListView.getSelectionModel();

            /* Use a change listener to respond to change of selection within a list view */
            vModel.selectedItemProperty().addListener(new ChangeListener<String>() {

                public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {

                    /* Display the selection */
                    responseLabel.setText("Name selected is :" + newValue);

                }

            });
            rootNode.getChildren().addAll(myListView, responseLabel, mySeparator);
            myStage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void stop() {
        System.out.println("Stopping Application...");
    }

}
