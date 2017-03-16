package QuizMaker;
import java.util.Scanner;

public class QuizDemo {
    public static void main(String[] args){
        MC one = new MC();
        one.setText("What does HARIBO(Context of Candy) stand for?");
        one.addChoice("Harry Boff", false);
        one.addChoice("Hans Riegal Bonn", true);
        one.addChoice("Happy Rinse Board", false);
        one.addChoice("Harrison Bach", false);

        presentQuestion(one);
    }
    public static void presentQuestion(MC q){
        q.display();
        System.out.println("Your Answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
