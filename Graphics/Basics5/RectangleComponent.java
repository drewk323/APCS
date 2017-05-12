package Basics5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 This component displays a rectangle that can be moved.
 */
public class RectangleComponent extends JComponent
{
    private static final int BOX_WIDTH = 30;
    private static final int BOX_HEIGHT = 30;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_LENGTH = 500;

    private static final int randomX = (int) (Math.random() * FRAME_WIDTH-BOX_WIDTH);
    private static final int randomY = (int) (Math.random() * FRAME_LENGTH-BOX_HEIGHT);

    private Rectangle box1;

    public RectangleComponent()
    {
        // The rectangle that the paintComponent method draws
        box1 = new Rectangle(randomX, randomY, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g1 = (Graphics2D) g;
        g1.draw(box1);
    }

    /**
     Moves the rectangle by a given amount.
     @param dx the amount to move in the x-direction
     @param dy the amount to move in the y-direction
     */
    public void moveRectangleBy(int dx, int dy)
    {
        box1.translate(dx, dy);
        repaint();
    }
}
