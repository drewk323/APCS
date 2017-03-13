package Employee;

public class Employee {
    protected String hireDate = "";
    protected String gender = "";
    protected String location = "";
    protected int age = 0;
    protected int salary = 0;
    protected int monthsSinceReview = 0;

    public String getHireDate(){
        return hireDate;
    }

    public String getGender(){
        return gender;
    }

    public String getLocation(){
        return location;
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public int getMonthsSinceReview(){
        return monthsSinceReview;
    }

    public void setGender(String settedGender){
        gender = settedGender;
    }

    public void setLocation(String settedLocation){
        location = settedLocation;
    }

    public void setHireDate(String settedHireDate){
        hireDate = settedHireDate;
    }

    public void setAge(int settedAge){
        age = settedAge;
    }

    public void setSalary(int settedSalary){
        salary = settedSalary;
    }
    public void setMonthsSinceReview(int settedMonthsSinceReview){
        monthsSinceReview = settedMonthsSinceReview;
    }

    public int computeNextReview(){
        int daysUntilReview = 0;
        int reviewIncrements = 30;

        daysUntilReview = reviewIncrements - monthsSinceReview;
        return daysUntilReview;
    }
}
