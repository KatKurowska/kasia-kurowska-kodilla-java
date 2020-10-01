package com.company;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


//Application is an abstract class - all methods must be implemented


public class Blackjack extends Application {

    private Image imageback = new Image("file:C:\\Users\\katak\\IdeaProjects\\kodilla-course\\Blackjack\\src\\com\\company\\resources/cardtable.jpg");
// adding new file "file: FULL PATH MUST BE THERE")
    private Image card = new Image("file:C:\\Users\\katak\\IdeaProjects\\kodilla-course\\Blackjack\\src\\com\\company\\resources\\2C.jpg");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main (String[] args) {
        launch(args);
        // launch (args); - standard procedure to launch app with JavaFX
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        cards.getChildren().add(img);

        grid.add(cards, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 1600,900, Color.BLACK);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
