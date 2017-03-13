package Card;

public class DriversLicense extends Card {
    private static int EXPIRATION_YEAR = 0;

    public DriversLicense(String n, int expirationYear){
        super(n);
        EXPIRATION_YEAR = expirationYear;
    }
}
