package OCP_Applied;

import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

import java.awt.*;

/**
 * Created by io on 2/7/16.
 */
public class Circle extends Shape {

    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int x, int y, int itsRadius) {
        centerX = x;
        centerY = y;
        radius = itsRadius;
    }

    public void draw(Graphics g) {
        g.drawArc(centerX-radius,
                centerY-radius,
                radius*2,
                radius*2,
                0,
                360);
    }

}
