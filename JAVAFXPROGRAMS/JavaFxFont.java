import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class JavaFxFont extends Application {
    public void init() {
        System.out.println("Starting Application....");
    }

    @Override
    public void start(Stage stage) {
        try {
            /* Creating a Text object */
            Text text = new Text();

            /*Setting font to the text */
            text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

            /* setting the position of the text */
            text.setX(50);
            text.setY(130);

            /* Setting the text to be added. */
            text.setText("Hi how are you");
            text.setFill(Color.BLUE);
            text.setStrokeWidth(2);
            text.setStroke(Color.BROWN);

            /* Creating a Group object */
            Group root = new Group(text);

            /* Creating a scene object */
            Scene scene = new Scene(root, 600, 300);

            /* Setting title to the Stage */
            stage.setTitle("Setting Font to the text");

            /* Adding scene to the stage */
            stage.setScene(scene);

            /* Displaying the contents of the stage */
            stage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        launch(args);
    }

    public void stop() {
        System.out.println("Stopping Application....");
    }
}