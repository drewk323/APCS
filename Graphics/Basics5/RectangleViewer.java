package Basics5;

import javax.swing.JFrame;

/**
 This program moves the rectangle.
 */
public class RectangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new RectangleFrame();
        frame.setTitle("Wrecktangle Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
