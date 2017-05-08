package Basics3;

public class BankAccount {
    private double initialBalance = 1000;
    private double currentBalance = 0;

    public BankAccount(double INITIAL_BALANCE){
        currentBalance = initialBalance;
    }

    public void deposit(int amount){
        currentBalance += amount;
    }

    public double getBalance(){
        return currentBalance;
    }
    public double getInterest(double interestRate){
        double interest = currentBalance * (interestRate / 100);
        double newAmount = interest + currentBalance;
        currentBalance = newAmount;
        return currentBalance;
    }
}
