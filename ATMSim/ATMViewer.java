import javax.swing.*;

/**
 * ATM simulator viewer and UI
 */

public class ATMViewer {

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args){

        ATM A = new ATM();
        JButton getBalanceButton = new JButton("Get Current Account Balance");
        JPanel panelA = new JPanel();
        JButton getPINButton = new JButton();
        JButton getAccountNumberButton = new JButton();

        /** Create the UI Window*/
        JFrame window = new JFrame();
        window.setName("ATM Simulator");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);

        window.add(panelA);

        /** Panel A and contents */

        panelA.setLocation(0, 0);
        panelA.setSize(200, 200);
        panelA.add(getBalanceButton);

        /** Create button to get account balance */
        getBalanceButton.setLocation(0, 0);
        getBalanceButton.setSize(120, 30);


    }
    public void pressed(){

    }
}
