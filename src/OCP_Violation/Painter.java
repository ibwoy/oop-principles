package OCP_Violation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by io on 2/5/16.
 */
public class Painter extends JPanel {

    private ArrayList shapes;

    public Painter(ArrayList shapesToDraw) {
        shapes = shapesToDraw;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i=0; i<shapes.size(); i++) {
            if(shapes.get(i).getClass().getName() == "Square") {
                Square s = (Square)shapes.get(i);
                g.drawRect(s.getTopLeftX(),
                        s.getTopLeftY(),
                        s.getWidth(),
                        s.getWidth());
            }
            else if(shapes.get(i).getClass().getName() == "Circle") {
                Circle c = (Circle)shapes.get(i);
                g.drawArc(c.getCenterX()-c.getRadius(),
                        c.getCenterY()-c.getRadius(),
                        c.getRadius()*2,
                        c.getRadius()*2,
                        0,
                        360);
            }
        }
    }
}
