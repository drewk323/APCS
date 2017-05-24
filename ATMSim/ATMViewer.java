import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ATM simulator viewer and UI
 */

public class ATMViewer extends JFrame {

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args) {
        GridBagConstraints c = new GridBagConstraints();

        /**--------------------|Create the UI Window|--------------------*/
        JFrame window = new JFrame();
        window.setTitle("ATM Simulator");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setBackground(Color.BLACK);

        /** Panel A setup */
        JPanel panelA = new JPanel(new GridBagLayout());
        panelA.setPreferredSize(new Dimension(200, 1080));
        panelA.setBackground(Color.GRAY);
        window.add(panelA, BorderLayout.EAST);

        /** Panel B setup */
        JPanel panelB = new JPanel(new GridBagLayout());
        panelB.setBackground(Color.YELLOW);
        window.add(panelB, BorderLayout.NORTH);

        /** Panel C setup */
        JPanel panelC = new JPanel(new GridBagLayout());
        panelC.setPreferredSize(new Dimension(1920, 1080));
        panelC.setBackground(Color.WHITE);
        window.add(panelC, BorderLayout.CENTER);

        /** Create button to get account balance */
        JButton balanceButton = new JButton("Get Current Balance");
        balanceButton.setPreferredSize(new Dimension(150, 40));
        c.insets = new Insets(10, 10, 30, 10);
        c.gridx = 0;
        c.gridy = 1;
        panelA.add(balanceButton, c);

        /** Create button to confirm both the PIN and Account Number */
        JButton enterButton = new JButton("Enter");
        enterButton.setPreferredSize(new Dimension(150, 40));
        c.gridx = 0;
        c.gridy = 2;
        panelA.add(enterButton, c);

        /** Create button to exit simulator */

        JButton exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(150, 40));
        exitButton.setBackground(Color.RED);
        c.gridx = 0;
        c.gridy = 3;
        panelA.add(exitButton, c);

        /** Create button to withdraw money */

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setPreferredSize(new Dimension(120, 30));
        c.gridx = 0;
        c.gridy = 1;
        panelC.add(withdrawButton, c);

        /** Create button to deposit money */

        JButton depositButton = new JButton("Deposit");
        depositButton.setPreferredSize(new Dimension(120, 30));
        c.gridx = 0;
        c.gridy = 2;
        panelC.add(depositButton);

        /**---------------|Text Displays|---------------*/

        JLabel balanceText = new JLabel("Current Balance: $0");
        balanceText.setPreferredSize(new Dimension(120, 30));
        c.gridx = 0;
        c.gridy = 3;
        panelC.add(balanceText);

        JLabel clientText = new JLabel("Name: Unknown");
        clientText.setPreferredSize(new Dimension(120, 30));
        c.gridx = 1;
        c.gridy = 1;
        panelC.add(clientText);

    }

    /**---------------|Button Functions|---------------*/
    private class exit implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == exitButton){
                System.out.println("Something");
            }

        }
    }

    ActionListener listener1 = new ActionListener;
}
