package Basics2;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JComponent;
/*
   A component that draws an alien face
*/
public class FaceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 150, 150);
        g2.setStroke(new BasicStroke(5));
        g2.draw(head);

        // Draw the eyes
        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(35, 70, 15, 15);
        g2.fill(eye);
        eye.translate(100, 0);
        g2.fill(eye);

        // Draw the mouth
        QuadCurve2D.Float newMouth = new QuadCurve2D.Float(50, 110, 50, 50, 20, 200);
        newMouth.setCurve(50, 110, 100, 100, 140, 110);
        g2.setColor(Color.BLACK);
        g2.draw(newMouth);

        Line2D.Double brow1 = new Line2D.Double(30, 60, 45, 60);
        g2.setColor(Color.BLACK);
        g2.draw(brow1);

        Line2D.Double brow2 = new Line2D.Double(145, 60, 130, 60);
        g2.setColor(Color.BLACK);
        g2.draw(brow2);

        // Draw the greeting
        g2.setColor(Color.BLACK);
        g2.drawString("Meep!", 70, 175);
    }
}
