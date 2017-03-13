package Employee;

public class Programmer extends Employee{
    protected String project = "";
    protected String programmingLanguage = "";

    public double calcRaise(){
        double raiseAmount = 0;
        double raisePercent = 0.05;

        raiseAmount = getSalary() * raisePercent;
        return raiseAmount;
    }
}
