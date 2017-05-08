package Basics3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 This program demonstrates how an action listener can access
 a variable from a surrounding block.
 */
public class InvestmentViewer1
{
    private static final int FRAME_WIDTH = 120;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JFrame frame2 = new JFrame();

        // The button to trigger the calculation
        JButton button = new JButton("Add Interest");
        frame.add(button);

        JButton button2 = new JButton("Get Balance");
        frame2.add(button2);
        frame.setLocation(140, 0);

        // The application adds interest to this bank account
        final BankAccount account = new BankAccount(INITIAL_BALANCE);

        class AddInterestListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            // The listener method accesses the account variable
            // from the surrounding block
            account.getInterest(INTEREST_RATE);
            System.out.println("balance: " + account.getBalance());
        }
    }

        class AddGetBalanceListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                // The listener method accesses the account variable
                // from the surrounding block
                System.out.println("balance: " + account.getBalance());
            }
        }

        ActionListener listener = new AddInterestListener();
        ActionListener listener2 = new AddGetBalanceListener();
        button.addActionListener(listener);
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}
