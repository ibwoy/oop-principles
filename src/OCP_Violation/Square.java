package OCP_Violation;

/**
 * Created by io on 2/5/16.
 */
public class Square {

    private int topLeftX;
    private int topLeftY;
    private int width;

    public Square(int x, int y, int itsWidth) {
        topLeftX = x;
        topLeftY = y;
        width = itsWidth;
    }

    public int getTopLeftX() { return topLeftX; }
    public int getTopLeftY() { return topLeftY; }
    public int getWidth() { return width; }

}
