import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class Index extends Application {
    Label myLabel;
    Button btn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Java Application");
        FlowPane rootNode = new FlowPane(200, 200);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 400, 400);
        myLabel = new Label("JAVAFX is a full GUI");
        btn = new Button("Click me !");
        Border red = null;
        btn.setBorder(red);
        primaryStage.setScene(scene);
        rootNode.getChildren().addAll(btn, myLabel);
        primaryStage.show();
    }

}
