
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;


public class EffectTransformFx extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurValue;

    public void init() {
        System.out.println("Starting Application...");
    }

    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage myStage) {
        try {

            myStage.setTitle("Java Application");
            FlowPane rootNodeFlowPane = new FlowPane(20, 20);
            rootNodeFlowPane.setAlignment(Pos.CENTER);
            Scene myScene = new Scene(rootNodeFlowPane, 300, 220);
            myStage.setScene(myScene);

            /* Create a push button */
            Button btnRotate = new Button("Rotate");
            Button btnBlur = new Button("Blur Off");
            Button btnScale = new Button("Scale");
            Label reflectLabel = new Label("Reflection add visual Sparkle");

            /* Create a initial effect and Transform */
            Reflection myReflection = new Reflection();
            BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
            Rotate myRotate = new Rotate();
            Scale scale = new Scale(scaleFactor, scaleFactor);

            btnRotate.getTransforms().add(myRotate);
            btnScale.getTransforms().add(scale);

            /* Set the reflection effect on the reflection label */
            myReflection.setTopOpacity(3.0);
            myReflection.setBottomOpacity(0.3);
            reflectLabel.setEffect(myReflection);

            /* Handle the action event on the rotate button */
            btnRotate.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent ae) {
                    angle += 15.0;
                    myRotate.setAngle(angle);
                    myRotate.setPivotX(btnRotate.getWidth() / 2);
                    myRotate.setPivotY(btnRotate.getHeight() / 2);

                }
            });

            /* Handle the action event for the Scale button */
            btnScale.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent ae) {

                    scaleFactor += 0.1;
                    if (scaleFactor > 2.0)
                        scaleFactor = 0.4;

                    scale.setX(scaleFactor);
                    scale.setY(scaleFactor);

                }
            });

            /* Handle the event action on the blur button */
            btnBlur.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent ae) {

                    if (blurValue == 10.0) {
                        blurValue = 1.0;
                        btnBlur.setEffect(null);
                        btnBlur.setText("Blur Off");

                    } else {
                        blurValue++;
                        btnBlur.setEffect(blur);
                        btnBlur.setText("Blur On");
                    }
                    blur.setWidth(blurValue);
                    blur.setHeight(blurValue);
                    
                }
            });

            /* Add the Label and Button on the scene */
            rootNodeFlowPane.getChildren().addAll(btnRotate, btnScale, btnBlur, reflectLabel);
            myStage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
