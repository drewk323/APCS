package QuizMaker;
import java.util.ArrayList;

public class MC extends Question{
    private ArrayList<String> choices;

    public MC() {
        choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        System.out.println("adding choice...");
        if (correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    @Override
    public void display(){
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
