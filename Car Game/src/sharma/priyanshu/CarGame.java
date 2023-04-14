package sharma.priyanshu;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CarGame extends Application {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;

    private static final int CAR_WIDTH = 50;
    private static final int CAR_HEIGHT = 100;
    private static final int CAR_SPEED = 5;

    private static final int OBSTACLE_WIDTH = 50;
    private static final int OBSTACLE_HEIGHT = 50;
    private static final int OBSTACLE_SPEED = 3;

    private Rectangle car;
    private Rectangle obstacle;
    private Label scoreLabel;

    private int score = 0;

    public static void main (String[] args) {
        launch (args);
    }

    @Override
    public void start (Stage primaryStage) {
        car = new Rectangle (CAR_WIDTH, CAR_HEIGHT, Color.BLUE);
        car.setTranslateX ((double) WIDTH / 2 - (double) CAR_WIDTH / 2);
        car.setTranslateY (HEIGHT - CAR_HEIGHT - 10);

        obstacle = new Rectangle (OBSTACLE_WIDTH, OBSTACLE_HEIGHT, Color.RED);
        obstacle.setTranslateX ((int) (Math.random () * (WIDTH - OBSTACLE_WIDTH)));
        obstacle.setTranslateY (-OBSTACLE_HEIGHT);

        scoreLabel = new Label ("Score: " + score);
        scoreLabel.setTextFill (Color.WHITE);

        StackPane stackPane = new StackPane ();
        StackPane.setAlignment (scoreLabel, Pos.TOP_LEFT);
        stackPane.getChildren ().addAll (car, obstacle, scoreLabel);

        Group root = new Group (stackPane);
        Scene scene = new Scene (root, WIDTH, HEIGHT);

        scene.setOnKeyPressed (event -> {
            if ( event.getCode () == KeyCode.LEFT ) {
                if ( car.getTranslateX () - CAR_SPEED >= 0 ) {
                    car.setTranslateX (car.getTranslateX () - CAR_SPEED);
                }
            } else if ( event.getCode () == KeyCode.RIGHT ) {
                if ( car.getTranslateX () + CAR_SPEED <= WIDTH - CAR_WIDTH ) {
                    car.setTranslateX (car.getTranslateX () + CAR_SPEED);
                }
            }
        });

        primaryStage.setScene (scene);
        primaryStage.show ();

        AnimationTimer animationTimer = new AnimationTimer () {
            @Override
            public void handle (long l) {
                obstacle.setTranslateY (obstacle.getTranslateY () + OBSTACLE_SPEED);

                if ( obstacle.getTranslateY () >= HEIGHT ) {
                    obstacle.setTranslateX ((int) (Math.random () * (WIDTH - OBSTACLE_WIDTH)));
                    obstacle.setTranslateY (-OBSTACLE_HEIGHT);
                    score++;
                    scoreLabel.setText ("Score: " + score);
                }

                if ( car.getBoundsInParent ().intersects (obstacle.getBoundsInParent ()) ) {
                    stop ();
                }
            }
        };
        animationTimer.start ();
    }
}