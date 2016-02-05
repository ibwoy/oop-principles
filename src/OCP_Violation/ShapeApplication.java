package OCP_Violation;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by io on 2/5/16.
 */
public class ShapeApplication extends JFrame{

    private Painter canvas;

    public ShapeApplication() {
        Square S1 = new Square(50, 50, 50);
        Circle C1 = new Circle(100, 100, 40);
        Circle C2 = new Circle(200, 100, 20);
        ArrayList shapes = new ArrayList();
        shapes.add(S1);
        shapes.add(C1);
        shapes.add(C2);

        canvas = new Painter(shapes);

        setContentPane(canvas);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    /**
     * Unit testing ShapeApplication
     */
    public static void main(String[] args) {
        ShapeApplication app1 = new ShapeApplication();
    }



}
