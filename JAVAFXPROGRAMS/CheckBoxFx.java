/* JavaFx Program for Check Box */

import javax.swing.Action;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.event.*;

public class CheckBoxFx extends Application
{
    Label selected, response;
    Label headingLabel;
    CheckBox cbSmartPhoneBox;
    CheckBox cbTableBox;
    CheckBox cbDesktopBox;
    CheckBox cbNotebookBox;
    CheckBox SamsungBox;
    CheckBox AppleBox;
    CheckBox SonyBox;
    CheckBox NokiaBox;
    CheckBox RedMeBox;
    CheckBox RealMeBox;
    CheckBox LenovoBox;
    CheckBox HpBox;
    CheckBox AsusBox;
    CheckBox iMacBox;

    String computerString;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void init()
    {
        System.out.println("Starting the application...");
    }

    @Override
    public void start(Stage myStage)
    {
        try
        {

            myStage.setTitle("Java Application");
            FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
            rootNode.setAlignment(Pos.CENTER);
            Scene myScene = new Scene(rootNode, 530, 610);
            myStage.setScene(myScene);
            Text myText = new Text();
            myText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));

            headingLabel = new Label("What computer do you own?");
            selected = new Label("");
            response = new Label("");
            cbSmartPhoneBox = new CheckBox("Smartphone");
            cbTableBox = new CheckBox("Tablet");
            cbDesktopBox = new CheckBox("Desktop");
            cbNotebookBox = new CheckBox("Notebook");

            SamsungBox = new CheckBox("SamsungMobile");
            AppleBox = new CheckBox("AppleMobile");
            SonyBox = new CheckBox("SonyMobile");
            NokiaBox = new CheckBox("NokiaMobile");
            RedMeBox = new CheckBox("RedMeMobile");

            RealMeBox = new CheckBox("RealMeMobile");
            LenovoBox = new CheckBox("LenovoMobile");
            HpBox = new CheckBox("HpLaptop");
            AsusBox = new CheckBox("AsusLaptop");
            iMacBox = new CheckBox("iMacLaptop");

            /* Handle the action event for the check boxes */

            cbSmartPhoneBox.setOnAction(new EventHandler<ActionEvent>()
            {

                @Override
                public void handle(ActionEvent ae)
                {
                    if (cbSmartPhoneBox.isSelected())
                    {
                        response.setText("Smartphone was just selected\n");
                    }
                    else
                    {
                        response.setText("Smartphone was just cleared\n");
                    }
                    showAll();

                }
            });
            cbTableBox.setOnAction(new EventHandler<ActionEvent>()
            {

                @Override
                public void handle(ActionEvent ae)
                {
                    if (cbTableBox.isSelected())
                    {
                        response.setText("Tablet Was just selected\n");
                    }
                    else
                    {
                        response.setText("Tablet was just cleared\n");
                    }
                    showAll();
                }
            });



            cbNotebookBox.setOnAction(new EventHandler<ActionEvent>()
            {

                @Override
                public void handle(ActionEvent ae)
                {
                    if (cbNotebookBox.isSelected())
                    {
                        response.setText("Notebook was just selected\n");
                    }
                    else
                    {
                        response.setText("Notebook was just cleared\n");
                    }
                    showAll();
                }
            });


            cbDesktopBox.setOnAction(new EventHandler<ActionEvent>()
            {

                @Override
                public void handle(ActionEvent ae)
                {
                    if (cbDesktopBox.isSelected())
                    {
                        response.setText("Desktop was just selected\n");
                    }
                    else
                    {
                        response.setText("Desktop was just cleared\n");
                    }
                    showAll();

                }
            });
            SamsungBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (SamsungBox.isSelected())
                    {
                        response.setText("SamsungMobile was selected");
                    }
                    else
                    {
                        response.setText("SamsungMobile was just cleared");
                    }
                    showAll();
                }
            });

            AppleBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (AppleBox.isSelected())
                    {
                        response.setText("AppleMobile was just Selected");
                    }
                    else
                    {
                        response.setText("AppleMobile was just cleared");
                    }
                    showAll();
                }
            });
            SonyBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (SonyBox.isSelected())
                    {
                        response.setText("SonyMobile was just selected");

                    }
                    else
                    {
                        response.setText("SonyMobile was just cleared");
                    }
                    showAll();
                }
            });
            NokiaBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (NokiaBox.isSelected())
                    {
                        response.setText("Nokia Mobile was selected");
                    }
                    else
                    {
                        response.setText("NokiaMobile was just cleared");
                    }
                    showAll();
                }
            });
            RedMeBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (RedMeBox.isSelected())
                    {
                        response.setText("RedMeMobile was selected");
                    }
                    else
                    {
                        response.setText("RedMeMobile was just cleared");
                    }
                    showAll();
                }
            });

            RealMeBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (RedMeBox.isSelected())
                    {
                        response.setText("RealMeMobile was just selected");
                    }
                    else
                    {
                        response.setText("RealMeMobile was just cleared");
                    }
                    showAll();
                }
            });

            LenovoBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (LenovoBox.isSelected())
                    {
                        response.setText("LenovoMobile is selected");
                    }
                    else
                    {
                        response.setText("LenovoMobile was just cleared");
                    }
                    showAll();
                }
            });
            HpBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (HpBox.isSelected())
                    {
                        response.setText("HpLaptop was just Selected");
                    }
                    else
                    {
                        response.setText("HpLaptop was just cleared");
                    }
                    showAll();
                }
            });


            AsusBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (AsusBox.isSelected())
                    {
                        response.setText("AsusLaptop was selected");
                    }
                    else
                    {
                        response.setText("AsusLaptop was just cleared");
                    }
                    showAll();
                }
            });

            iMacBox.setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent ae)
                {
                    if (iMacBox.isSelected())
                    {
                        response.setText("iMacLaptop was just selected");
                    }
                    else
                    {
                        response.setText("iMacLaptop was just cleared");
                    }
                    showAll();
                }
            });


            /* @Add scene to the control graph */

            rootNode.getChildren().addAll(headingLabel, cbSmartPhoneBox, cbTableBox, cbNotebookBox, cbDesktopBox,
                                          SamsungBox, AppleBox, SonyBox, NokiaBox, RedMeBox, RealMeBox, LenovoBox, HpBox, AsusBox, iMacBox,
                                          response, selected);
            myStage.show();
            showAll();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    /* Update and show the selection */
    public void showAll()
    {

        computerString = "";
        if (cbSmartPhoneBox.isSelected())
            computerString = "Smartphone";
        if (cbTableBox.isSelected())
            computerString += "Tablet\n";
        if (cbNotebookBox.isSelected())
            computerString += "Notebook  ";
        if (cbDesktopBox.isSelected())
            computerString += "Desktop\n";
        if (SamsungBox.isSelected())
            computerString += "SamsungMobile  ";
        if (AppleBox.isSelected())
            computerString += "AppleMobile\n";
        if (SonyBox.isSelected())
            computerString += "SonyMobile   ";
        if (NokiaBox.isSelected())
            computerString += "NokiaMobile\n";
        if (RedMeBox.isSelected())
            computerString += "RedMeMobile   ";
        if (RealMeBox.isSelected())
            computerString += "RealMeMobile\n";
        if (LenovoBox.isSelected())
            computerString += "LenovoMobile   ";
        if (HpBox.isSelected())
            computerString += "HpLaptop\n";
        if (AsusBox.isSelected())
            computerString += "AsusLaptop   ";
        if (iMacBox.isSelected())
            computerString += "iMacLaptop";
        selected.setText("\nComputers selected : \n" + computerString + "\t\n ");
    }

    public void stop()
    {

        System.out.println("Stopping the Application..");
    }

}
