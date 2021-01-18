
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class TextFieldFx extends Application {
    TextField textField;
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {

        myStage.setTitle("Java Application");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        /* @Create the Scene and set to the layout */
        Scene myScene = new Scene(rootNode, 230, 340);
        myStage.setScene(myScene);

        /* Create a Label that will report the state of selected checkbox */
        response = new Label("Enter Name :");

        /* Create the button that gets the text */
        Button buttonGetText = new Button("Get Name");


        /* Create a text Field */
        textField = new TextField();
        textField.setPromptText("Enter a name :");
        textField.setVisible(true);
        textField.setPrefColumnCount(15);

        /* Pressed while the get the text field has input focus */
        textField.setOnAction((ae) -> response.setText("Button Pressed = " + textField.getText()));

        /* Use a lambda expression to handle action event for the text field **/
        buttonGetText.setOnAction((ae) -> response.setText("Button pressed\nName is = " + textField.getText()));

        /* Use a separator to better organize the layout */
        Separator mySeparator = new Separator();
        mySeparator.setPrefWidth(180);

        rootNode.getChildren().addAll(textField, buttonGetText, mySeparator, response);
        myStage.show();

    }
}
