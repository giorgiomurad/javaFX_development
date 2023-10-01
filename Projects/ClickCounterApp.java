package com.example.fxdemo;

// Problem from JavaFX For Dummies by Doug Lowe
//
// Part 1:      Getting Started With JavaFx
// Chapter 2:   Looking Closer at JavaFX
// Problem :    Write an application that shows a button in the center with a label that shows how
//              many times the button is clicked by the user.
//              Everytime the button is clicked, the counter is incremented by one, and the label changes
//              to display the new counter:
//                  - No Click      ->  "Click the button below"
//                  - One Click     ->  "You have clicked once"
//                  - Two Clicks    ->  "You have clicked twice"
//                  - Three Clicks  ->  "You have clicked 3 times"
//                  .....
//
//
// Author:  Giorgio Murad Murad

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApplication extends Application {
    int counter = 0;
    Button btn;
    Label lbl;


    @Override
    public void start(Stage primaryStage) {
        // Initializing the button
        btn = new Button();
        btn.setText("Click!");
        btn.setOnAction(e -> btnClick());

        // Initializing the label
        lbl = new Label();
        lbl.setText("Click The Button Below.");

        // Adding the button and the label to the border layout
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-font-family: sans-serif;");
        pane.setTop(lbl);
        pane.setCenter(btn);

        // Adding the layout pane to the scene
        Scene scene = new Scene(pane, 250, 150);

        // Finalizing the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    // Method that increments the counter by one
    public void btnClick() {
        counter++;


        if (counter == 1)
            lbl.setText("You Have Clicked Once.");

        else if (counter == 2)
            lbl.setText("You Have Clicked Twice.");

        else
            lbl.setText("You Have Clicked " + counter + " Times.");
    }
}