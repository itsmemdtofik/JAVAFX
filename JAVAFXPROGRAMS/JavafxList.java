

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class JavafxList extends Application {
    Label responseLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Java Application");
        FlowPane rootNode = new FlowPane(15, 15);
        rootNode.setAlignment(Pos.CENTER);

        /** Create a Scene **/
        Scene myScene = new Scene(rootNode, 200, 120);
        myStage.setScene(myScene);

        responseLabel = new Label("Select Computer Type");
        ObservableList<String> compyterType = FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook",
                "Desktop");

        /* Create a List View */
        ListView<String> vComputer = new ListView<String>(compyterType);
        vComputer.setPrefSize(100, 70);


        /* Get the view selection model */
        MultipleSelectionModel<String> multipleSelectionModel = vComputer.getSelectionModel();

        /* Use a change listener to responde a change of selection within a list view */
        multipleSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

                /* @Display the Selection */
                responseLabel.setText("Computer Selected is : " + newVal);
               

            }

        });

        /* Add the label list */
        rootNode.getChildren().addAll(vComputer, responseLabel);
        myStage.show();

    }

}
