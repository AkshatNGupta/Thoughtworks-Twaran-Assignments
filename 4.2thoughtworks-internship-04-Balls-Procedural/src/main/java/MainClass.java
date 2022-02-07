import processing.core.PApplet;
public class MainClass extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    public static int A = 0;

    public static void main(String args[]){
        PApplet.main("MainClass",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        int rgb = 255;
//        backgroundChange(rgb);
        drawCircle();
    }

    private void drawCircle() {
        ellipse(A,HEIGHT/5,RADIUS, RADIUS);
        ellipse(2*A,2*HEIGHT/5,RADIUS, RADIUS);
        ellipse(3*A,3*HEIGHT/5,RADIUS, RADIUS);
        ellipse(4*A,4*HEIGHT/5,RADIUS, RADIUS);
        A++;
    }

    private void backgroundChange(int rgb) {
        background(rgb);
    }
}
