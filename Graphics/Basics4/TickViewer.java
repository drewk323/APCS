package Basics4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 This program displays the growth of an investment.
 */
public class TickViewer
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        //Change the frame position
        frame.setLocation(100, 100);

        // The buttons to trigger the calculation
        JButton button = new JButton("Add 1 Tick");

        JButton button2 = new JButton("Add 2 Ticks");

        JButton button3 = new JButton("Add 3 Ticks");

        //Create new ticker
        TickCounter ticker = new TickCounter();

        //Results display
        final JLabel label = new JLabel("Tick Count: " + ticker.getCurrentTicks());

        // The panel that holds the user interface components
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        panel.setLocation(0, 0);
        panel.setSize(100, 50);

        JPanel panel2 = new JPanel();
        panel2.add(button2);
        panel2.add(label);
        frame.add(panel2);
        panel2.setLocation(0, 50);
        panel2.setSize(100, 50);

        JPanel panel3 = new JPanel();
        panel3.add(button3);
        panel3.add(label);
        frame.add(panel3);
        panel3.setLocation(0, 100);
        panel3.setSize(100, 50);

        class oneTickListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                ticker.oneTick();
                label.setText("Tick Count: " + ticker.getCurrentTicks());
            }
        }

        class twoTickListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                ticker.twoTicks();
                label.setText("Tick Count: " + ticker.getCurrentTicks());
            }
        }

        class threeTickListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                ticker.threeTicks();
                label.setText("Tick Count: " + ticker.getCurrentTicks());
            }
        }

        ActionListener listener = new oneTickListener();
        button.addActionListener(listener);

        ActionListener listener2 = new twoTickListener();
        button2.addActionListener(listener2);

        ActionListener listener3 = new threeTickListener();
        button3.addActionListener(listener3);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

