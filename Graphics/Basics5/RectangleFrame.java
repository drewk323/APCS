package Basics5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 This frame contains a moving rectangle.
 */
public class RectangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private RectangleComponent scene1;

    class TimerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            int randomX = (int) (Math.random() * 2);
            int randomY = (int) (Math.random() * 2);

            scene1.moveRectangleBy(randomX, randomY);
        }
    }


    public RectangleFrame()
    {
        scene1 = new RectangleComponent();

        add(scene1);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();

        int randomT = (int) (Math.random() * 10);
        final int DELAY = randomT; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
