import java.awt.*;

/** Main ATM class */

public class ATM {
    private static final int ATM_ID = 1;
    private static final int PIN = 1234;
    private static final int ACCOUNT_NUMBER = 12345;
    private static final String CLIENT_NAME = "Drew";

    private int balance = 0;
    private int temporaryPIN;
    private int temporaryAccountNumber;

    private boolean verifiedPIN = false;
    private boolean verifiedAccountNumber = false;

    private int getBalance(){
        return balance;
    }

    private int getPIN(){
        return PIN;
    }

    private int getAccountNumber(){
        return ACCOUNT_NUMBER;
    }

    private String getClientName() {
        return CLIENT_NAME;
    }

    private void setPIN(int newPIN){
        temporaryPIN = newPIN;
    }

    private void setAccountNumber(int newAccountNumber){
        temporaryAccountNumber = newAccountNumber;
    }

    private boolean isVerifiedPIN(){
        return verifiedPIN;
    }

    private boolean isVerifiedAccountNumber(){
        return verifiedAccountNumber;
    }




}
