import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ATM simulator viewer and UI
 */

//refer to https://docs.oracle.com/javase/7/docs/api/java/awt/GridBagLayout.html
    //https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html

public class ATMViewer extends JFrame {

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args) {
        ATM alpha = new ATM();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        /**--------------------|Create the UI Window|--------------------*/
        JFrame window = new JFrame();
        window.setTitle("ATM Simulator");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setBackground(Color.BLACK);

        /** Panel A setup (side panel for minor functions)*/
        JPanel panelA = new JPanel(new GridBagLayout());
        panelA.setPreferredSize(new Dimension(200, 1080));
        panelA.setBackground(Color.GRAY);
        window.add(panelA, BorderLayout.EAST);

        /** Panel B setup (background for main interactions) */
        JPanel panelB = new JPanel(new GridBagLayout());
        panelB.setPreferredSize(new Dimension(800, 800));
        panelB.setBackground(Color.RED);
        window.add(panelB, BorderLayout.CENTER);
        c.weightx = 1.0;
        c.weighty = 1.0;

        /** Panel C setup (main buttons)*/
        JPanel panelC = new JPanel(new GridBagLayout());
        panelC.setPreferredSize(new Dimension(500, 500));
        panelC.setBackground(Color.YELLOW);
        panelB.add(panelC, BorderLayout.CENTER);

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
        panelB.add(balanceText);

        JLabel clientText = new JLabel("Name: Unknown");
        clientText.setPreferredSize(new Dimension(120, 30));
        c.gridx = 0;
        c.gridy = 4;
        panelB.add(clientText);

        JLabel multiuseText = new JLabel("Multiuse Text");
        clientText.setPreferredSize(new Dimension(120, 30));
        c.gridx = 0;
        c.gridy = 5;
        panelB.add(multiuseText);

        JLabel depositText = new JLabel("Please Enter Amount");
        depositText.setPreferredSize(new Dimension(100, 30));
        c.gridx = 0;
        c.gridy = 6;
        panelA.add(depositText);

        /**---------------|Button Functions|---------------*/
        class depositFunction implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println(depositText.getText());
                System.out.println("Money deposited");
            }
        }

        class withdrawFunction implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Money withdrawn");
            }
        }

        class enterFunction implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Pin and Account Number Confirmed");
            }
        }

        class exitFunction implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                window.dispose();
                System.out.println("Simulator closed");
            }
        }

        class balanceFunction implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                balanceText.setText("Current Balance: $" + alpha.getBalance());
                System.out.println("Balance taken");
            }
        }

        balanceButton.addActionListener(new balanceFunction());
        depositButton.addActionListener(new depositFunction());
        withdrawButton.addActionListener(new withdrawFunction());
        enterButton.addActionListener(new enterFunction());
        exitButton.addActionListener(new exitFunction());
    }
}
