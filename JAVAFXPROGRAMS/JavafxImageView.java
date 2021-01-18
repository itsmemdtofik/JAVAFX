import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class JavafxImageView extends Application {
    public void init() {
        System.out.println("Starting the application...");
    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage myStage) {
        try {

            myStage.setTitle("Java Application");
            FlowPane rootNode = new FlowPane();
            rootNode.setAlignment(Pos.CENTER);
            Scene myScene = new Scene(rootNode, 300, 200);
            myStage.setScene(myScene);
            /*Create an Image */
            Image rrr = new Image("/home/mohammad/Pictures/hoursglass.jpg");
            /* Create an Image view that Uses the image */
            ImageView hoursglassIV = new ImageView(rrr);
            rootNode.getChildren().add(hoursglassIV);
            myStage.show();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void stop(){
        System.out.println("Stopping application...");
    }
}
