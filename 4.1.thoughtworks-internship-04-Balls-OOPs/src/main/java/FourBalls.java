import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 640;
    public static final int WIDTH = 480;
    public static final int NUMBER_OF_BALLS = 4;
    public static int SPEED = 1;
    public static ArrayList<Ball> Balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
//        Set the window width and height.
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        Setup 4 balls.
        for (int ball = 1; ball <= NUMBER_OF_BALLS; ball++) {
            Balls.add(new Ball(ball, HEIGHT, NUMBER_OF_BALLS));
        }
    }

    @Override
    public void draw() {
        drawCircle();
        SPEED++;
    }

    public void drawCircle() {
        for (Ball ball : Balls) {
            ellipse(SPEED * ball.speed, ball.y_pos, ball.diameter, ball.diameter);
        }
    }
}