package QuizMaker;

public class QuizDemo {
    public static void main(String[] args){
        MC one = new MC();
        one.setText("What does HARIBO(Context of Candy) stand for?");
        one.addChoice("Harry Boff", false);
        one.addChoice("Hans Riegal Bonn", true);
        one.addChoice("Happy Rinse Bored", false);
        one.addChoice("Harrison Bach", false);
    }
}
