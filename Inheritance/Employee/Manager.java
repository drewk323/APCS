package Employee;

public class Manager extends Employee {
    protected int numberOfEmployees = 0;
    protected String title = "Manager";

    public int calcBonus(){
        int bonus = 500;
        int totalSalary = 0;

        totalSalary = bonus + getSalary();
        return totalSalary;
    }
}
