import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

public class BackGroundJavaFx extends Application {
    public void start(Stage stage) {
        /* Defining the X and Y axes */
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        /* Setting labels to the axes */
        xAxis.setLabel("Months");
        yAxis.setLabel("Rainfall (mm)");
        /* Creating the Area chart */
        AreaChart<String, Number> areaChart = new AreaChart(xAxis, yAxis);
        /* Prepare data for the area chart */
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Jan", 13.2));
        series.getData().add(new XYChart.Data("Feb", 7.9));
        series.getData().add(new XYChart.Data("Mar", 15.3));
        series.getData().add(new XYChart.Data("Apr", 20.2));
        series.getData().add(new XYChart.Data("May", 35.7));
        series.getData().add(new XYChart.Data("June", 103.8));
        series.getData().add(new XYChart.Data("July", 169.9));
        series.getData().add(new XYChart.Data("Aug", 178.7));
        series.getData().add(new XYChart.Data("Sep", 158.3));
        series.getData().add(new XYChart.Data("Oct", 97.2));
        series.getData().add(new XYChart.Data("Nov", 22.4));
        series.getData().add(new XYChart.Data("Dec", 5.9));
        /* Setting the name to the line (series) */
        series.setName("Rainfall In Hyderabad");
        /* Setting data to the area chart */
        areaChart.getData().addAll(series);
        /* Creating a stack pane to hold the chart */
        StackPane pane = new StackPane(areaChart);
        /* Setting the Scene */
        Scene scene = new Scene(pane, 595, 300);
        stage.setTitle("Area Chart");
        stage.setScene(scene);
        scene.getStylesheets().add("javafx_transformastions/color.css");
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}