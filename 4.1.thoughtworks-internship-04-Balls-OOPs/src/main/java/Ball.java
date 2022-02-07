public class Ball {
    int x_pos;
    int y_pos;
    int speed;
    int diameter;

    public Ball(int ball, int windowHeight, int numberOfBalls) {
        this.x_pos = 0;
        this.y_pos = getY_pos(ball, windowHeight, numberOfBalls);
//        System.out.println(y_pos);
        this.speed = ball;
        this.diameter = 10;
    }

    private int getY_pos(int ball, int windowHeight, int numberOfBalls) {
        System.out.println(ball + "  " + numberOfBalls);
        System.out.println((float) ball / (numberOfBalls + 1));
        return (int) (windowHeight * ((float) ball / (numberOfBalls + 1)));
    }
}