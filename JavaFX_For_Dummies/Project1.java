// Problem from JavaFX For Dummies by Doug Lowe
//
// Part 1:      Getting Started With JavaFx
// Chapter 1:   Hello, JavaFX!
// Problem :    Write an application that shows a button in the center with the text 'Click Me Please'.
//              Everytime the button is clicked, the text of the button changes between
//              'Click Me Please' and 'You have clicked me'
//
//
// Author:  Giorgio Murad Murad

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApplication extends Application {
    Button btn;

    @Override
    public void start(Stage primaryStage) {
        // Creating the button
        btn = new Button();
        btn.setText("Click Me Please");
        btn.setOnAction(e -> btnClick());

        // Add the button to the layout pane
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-font-family: sans-serif;");
        pane.setCenter(btn);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        // Finalize and show the page
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Me App!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void btnClick() {

        if (btn.getText().equals("Click Me Please"))
            btn.setText("You have clicked me.");

        else
            btn.setText("Click Me Please");
    }
}