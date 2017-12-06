package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.Arrays;
import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("PointLine");
        Scanner scanner = new Scanner(System.in);
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);

        Point []points = new Point[6];
        for (int i = 0; i < points.length; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x,y);
            points[i] = point;
        }

        // X sort

        Arrays.sort(points);

        // Y sort

        XYChart.Series series1 = new XYChart.Series();
        int j = 0;
        series1.getData().add(new XYChart.Data(points[0].getX(), points[0].getY()));
        for (int i = 0; i < points.length - 1; i++) {
            if (points[j].getY() <= points[i + 1].getY()) {
                points[j] = null;
                j = i + 1;
                series1.getData().add(new XYChart.Data(points[i + 1].getX(), points[i + 1].getY()));
            }
        }



        primaryStage.setScene(new Scene(lineChart, 1280, 720));
        lineChart.getData().add(series1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
