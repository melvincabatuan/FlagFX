package com.example.flagfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    // Flag 1
    @Override
    public void start(Stage primaryStage) {
        PhilippineFlag flag = new PhilippineFlag(920,800);
        Canvas canvas = flag.getFlag(700,400,100,200);

        Pane root = new Pane();
        root.getChildren().add(canvas);
        root.setStyle("-fx-background-color: azure");

        primaryStage.setTitle("Philippine Flag");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    // Flag 2
//    @Override
//    public void start(Stage stage)  {
//        // Custom color red and blue
//        Color customRed = Color.web("FA2216");
//        Color customBlue = Color.web("0021C5");
//
//        Group g = new Group();
//
//        // NOTE: Sizes copied from old file from ACM Graphics
//
//        // creates the top half of the flag
//        Rectangle blueFlag = new Rectangle(754, 235.5);
//        blueFlag.setFill(customBlue);
//        g.getChildren().add(blueFlag);
//
//        // creates the bottom half of the flag
//        Rectangle redFlag = new Rectangle(754, 235.5);
//        redFlag.setY(235.5);
//        redFlag.setFill(customRed);
//        g.getChildren().add(redFlag);
//
//        // creates the triangle for the flag
//        Polygon triangle = new Polygon();
//        triangle.getPoints().addAll(0.0, 0.0,
//                270.0, 234.5,
//                0.0, 469.0);
//        triangle.setFill(Color.WHITE);
//        g.getChildren().add(triangle);
//
//        // creates the sun
//        Circle sun = new Circle(110, 230, 35);
//        sun.setFill(Color.YELLOW);
//        g.getChildren().add(sun);
//
//        // creates the rays of the sun (8 rays)
//        Line ray1 = new Line(110, 195, 110, 155);
//        ray1.setStroke(Color.YELLOW);
//        g.getChildren().add(ray1);
//
//        Line ray2 = new Line(110, 267, 110, 307);
//        ray2.setStroke(Color.YELLOW);
//        g.getChildren().add(ray2);
//
//        Line ray3 = new Line(30, 230, 75, 230);
//        ray3.setStroke(Color.YELLOW);
//        g.getChildren().add(ray3);
//
//        Line ray4 = new Line(145, 230, 185, 230);
//        ray4.setStroke(Color.YELLOW);
//        g.getChildren().add(ray4);
//
//        Line ray5 = new Line(85, 206, 57, 175);
//        ray5.setStroke(Color.YELLOW);
//        g.getChildren().add(ray5);
//
//        Line ray6 = new Line(139, 211, 164, 181);
//        ray6.setStroke(Color.YELLOW);
//        g.getChildren().add(ray6);
//
//        Line ray7 = new Line(136, 257, 159, 282);
//        ray7.setStroke(Color.YELLOW);
//        g.getChildren().add(ray7);
//
//        Line ray8 = new Line(87, 256, 58, 279);
//        ray8.setStroke(Color.YELLOW);
//        g.getChildren().add(ray8);
//
//        // extra coordinates for the stars so I don't have to change the basis - used for all stars
//        double addX, addY;
//
//        // Star at top left of flag
//        Polyline star1 = new Polyline();
//        addY = 15;
//        star1.getPoints().addAll(1.0, 8.5 + addY,
//                8.5, 7.5 + addY,
//                11.0, 1.0 + addY,
//                13.5, 7.5 + addY,
//                21.0, 8.5 + addY,
//                16.0, 12.5 + addY,
//                17.0, 19.0 + addY,
//                11.0, 15.0 + addY,
//                5.0, 19.0 + addY,
//                6.0, 12.5 + addY,
//                1.0, 8.5 + addY);
//        star1.setStroke(Color.YELLOW);
//        star1.setFill(Color.YELLOW);
//        g.getChildren().addAll(star1);
//
//        // Star at bottom left of flag
//        Polyline star2 = new Polyline();
//        addY = 429;
//        star2.getPoints().addAll(1.0, 8.5 + addY,
//                8.5, 7.5 + addY,
//                11.0, 1.0 + addY,
//                13.5, 7.5 + addY,
//                21.0, 8.5 + addY,
//                16.0, 12.5 + addY,
//                17.0, 19.0 + addY,
//                11.0, 15.0 + addY,
//                5.0, 19.0 + addY,
//                6.0, 12.5 + addY,
//                1.0, 8.5 + addY);
//        star2.setStroke(Color.YELLOW);
//        star2.setFill(Color.YELLOW);
//        g.getChildren().addAll(star2);
//
//        // Star at the rightmost part of the triangle
//        Polyline star3 = new Polyline();
//        addX = 230;
//        addY = 220;
//        star3.getPoints().addAll(1.0 + addX, 8.5 + addY,
//                8.5 + addX, 7.5 + addY,
//                11.0 + addX, 1.0 + addY,
//                13.5 + addX, 7.5 + addY,
//                21.0 + addX, 8.5 + addY,
//                16.0 + addX, 12.5 + addY,
//                17.0 + addX, 19.0 + addY,
//                11.0 + addX, 15.0 + addY,
//                5.0 + addX, 19.0 + addY,
//                6.0 + addX, 12.5 + addY,
//                1.0 + addX, 8.5 + addY);
//        star3.setStroke(Color.YELLOW);
//        star3.setFill(Color.YELLOW);
//        g.getChildren().addAll(star3);
//
//        stage.setTitle("Philippine Flag");
//        stage.setScene(new Scene(g, 754, 469));
//        stage.show();
//    }

    public static void main(String[] args) {
        launch();
    }
}