package Basics1;
/**
 * Write a description of class dfd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.util.Scanner;

public class EmptyFrameViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1920, 1080);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Scanner in = new Scanner(System.in);
        Boolean closed = false;
        String str = "";
        while (!str.equals("198230")) {
            System.out.println("Please type in 'open' or 'close' to open/close the frame.");
            str = in.nextLine();

            if (str.equals("close")) {
                frame.setVisible(false);
                closed = true;
                System.out.println("Frame closed");
            }
            if (str.equals("open")) {
                frame.setVisible(true);
                closed = false;
                System.out.println("Frame opened");
            }
        }
    }
}

