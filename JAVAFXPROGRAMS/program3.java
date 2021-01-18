import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class program3 extends Application
{
    int compGCD(int a, int b)
    {
        if(b%a==0)
            return a;
        else if(a%b==0)
            return b;
        if(a>b)
            return compGCD(a%b,b);
        else
            return compGCD(b%a,a);
    }
    @Override
    public void start(Stage mainStage)
    {
        mainStage.setTitle("GCD Calculator");
        GridPane gridRoot = new GridPane();

        Label l1 = new Label("Number 1");
        Label l2 = new Label("Number 2");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Text t = new Text();
        Button gcd = new Button("GCD");
        Button clr = new Button("Clear");

        Scene s = new Scene(gridRoot, 300, 400);
        gridRoot.addRow(0,l1,tf1);
        gridRoot.addRow(1,l2,tf2);
        gridRoot.add(gcd,1,2);
        gridRoot.add(clr,1,3);
        gridRoot.add(t,1,4);
        gridRoot.setHgap(5);
        gridRoot.setVgap(5);
        gcd.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent arg0)
            {
                int n1 = Integer.parseInt(tf1.getText());
                int n2 = Integer.parseInt(tf2.getText());
                int ans=compGCD(n1,n2);
                t.setText("The GCD of "+n1+" and "+n2+" is = "+ans);
            }
        });
        clr.setOnAction(at->
        {
            tf1.setText("");
            tf2.setText("");
            t.setText("");
        });
        mainStage.setScene(s);
        mainStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}