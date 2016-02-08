package OCP_Applied;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by io on 2/7/16.
 */
public class Painter extends JPanel {
    private ArrayList shapes;

    public Painter(ArrayList shapesToDraw) {
        shapes = shapesToDraw;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i=0; i<shapes.size(); i++)
        {
            Shape shape = (Shape)shapes.get(i);
            shape.draw(g);
        }
    }
}
