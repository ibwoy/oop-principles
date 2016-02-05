package OCP_Violation;

/**
 * Created by io on 2/5/16.
 */
public class Circle {

    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int x, int y, int itsRadius) {
        centerX = x;
        centerY = y;
        radius = itsRadius;
    }

    public int getCenterX() {
        return centerX;
    }
    public int getCenterY() {
        return centerY;
    }
    public int getRadius() {
        return radius;
    }
}
