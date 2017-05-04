package Basics1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Rectangle box1 = new Rectangle(0, 0, 10, 20);
        Rectangle box2 = new Rectangle(0, 0, 10, 20);
        Rectangle box3 = new Rectangle(0, 0, 10, 20);
        Rectangle box4 = new Rectangle(0, 0, 10, 20);
        Rectangle box5 = new Rectangle(0, 0, 10, 20);

        g2.draw(box1);
        g2.draw(box2);
        g2.draw(box3);
        g2.draw(box4);
        g2.draw(box5);

        box1.translate(0, 0);
        box2.translate(470, 0);
        box3.translate(0, 440);
        box4.translate(470, 440);
        box5.translate(230, 240);

        // Draw moved rectangle
        g2.draw(box1);
        g2.draw(box2);
        g2.draw(box3);
        g2.draw(box4);
        g2.draw(box5);


    }
}
