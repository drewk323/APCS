import java.awt.*;

/** Main ATM class */

public class ATM {
    private static final int ATM_ID = 1;
    private static final int PIN = 1234;
    private static final int ACCOUNT_NUMBER = 12345;
    private static final String CLIENT_NAME = "Drew";

    private int balance = 0;
    private int enterAttempts = 5;
    private int temporaryPIN;
    private int temporaryAccountNumber;
    private int depositAmount;

    private boolean verifiedPIN = false;
    private boolean verifiedAccountNumber = false;

    public int getBalance(){
        return balance;
    }

    public int getPIN(){
        return PIN;
    }

    public int getAccountNumber(){
        return ACCOUNT_NUMBER;
    }

    public int getDepositAmount(){
        return depositAmount;
    }

    public void depositMoney(){
        if (depositAmount != 0){
            balance += depositAmount;
        }
    }

    public String getClientName() {
        return CLIENT_NAME;
    }

    public void setPIN(int newPIN){
        temporaryPIN = newPIN;
    }

    public void setAccountNumber(int newAccountNumber){
        temporaryAccountNumber = newAccountNumber;
    }

    public boolean isVerifiedPIN(){
        return verifiedPIN;
    }

    public boolean isVerifiedAccountNumber(){
        return verifiedAccountNumber;
    }




}
