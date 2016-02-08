package OCP_Applied;

import java.awt.*;

/**
 * Created by io on 2/7/16.
 */
public class Square extends Shape {

    private int topLeftX;
    private int topLeftY;
    private int width;

    public Square(int x, int y, int itsWidth) {
        topLeftX = x;
        topLeftY = y;
        width = itsWidth;
    }

    public void draw(Graphics g) {
        g.drawRect(topLeftX, topLeftY, width, width);
    }
}
