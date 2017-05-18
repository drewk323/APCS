import javax.swing.*;
import java.awt.*;

/**
 * ATM simulator viewer and UI
 */

//Videos to Watch
    https://www.youtube.com/watch?v=mH1TltI61yU

public class ATMViewer {

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args){

        ATM A = new ATM();
        GridBagConstraints c = new GridBagConstraints();

        /** Create the UI Window*/
        JFrame window = new JFrame();
        window.setTitle("ATM Simulator");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setBackground(Color.BLACK);

        /** Panel A and contents */

        JPanel panelA = new JPanel();
        panelA.setLocation(0, 0);
        panelA.setSize(200, 500);
        panelA.setBackground(Color.RED);
        panelA.setLayout(new GridBagLayout());
        window.add(panelA);

        /** Create button to get account balance */
        JButton getBalanceButton = new JButton();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        getBalanceButton.setSize(120, 30);
        panelA.add(getBalanceButton, c);

        /** Create button to confirm both the PIN and Account Number */
        JButton enterButton = new JButton();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        enterButton.setSize(120, 30);
        panelA.add(enterButton, c);


    }

}
