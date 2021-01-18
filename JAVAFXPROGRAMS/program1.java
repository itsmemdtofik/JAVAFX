import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.geometry.*;
public class program1 extends Application
{
    @Override
    public void start(Stage mainStage)
    {
        mainStage.setTitle("This is my first JavaFX Application");
        Label l1 = new Label("Welcome to JavaFX programming!");
        l1.setFont(new Font( 20));
        // l1.setFont(new Font("Arial", 20));
        FlowPane root = new FlowPane();
        root.setHgap(5);
        root.setVgap(5);
        l1.setTextFill(Color.MAGENTA);
        Scene s1 = new Scene(root,500,200);
        root.getChildren().addAll(l1);
        root.setAlignment(Pos.CENTER);

        mainStage.setScene(s1);
        mainStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
