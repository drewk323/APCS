package Vehicle;

public class Vehicle {

    protected String make = "";
    protected int modelYear = 0;
    protected int price = 0;
    protected int weight = 0;
    protected int fuelRange = 0;
    protected int tankCapacity = 0;
    protected int currentGasAmount = 0;
    protected int maxSpeed = 0;
    protected int currentSpeed = 0;
    protected boolean driving = false;


    public void drive() {
        System.out.println("You are now driving");
        currentGasAmount--;
        fuelRange -= 25;
        System.out.println("You drove 25 miles and used 1 gallon of gas");
        System.out.println("Gas: " + currentGasAmount + " gal");
        System.out.println("Range: " + fuelRange + " mi");
    }

    public void fillGas() {
        System.out.println("You filled your gas tank");
        System.out.println("You now have: " + currentGasAmount + " Gallons of Gas");
    }

    public String getMake() {
        return make;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelRange() {
        return fuelRange;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getCurrentGasAmount() {
        return currentGasAmount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isDriving() {
        return driving;
    }

    public void setMake(String settedMake){
        make = settedMake;
    }

    public void setModelYear(int settedModelYear){
        modelYear = settedModelYear;
    }

    public void setPrice(int settedPrice){
        price = settedPrice;
    }

    public void setWeight(int settedWeight){
        weight = settedWeight;
    }

    public void setFuelRange(int settedFuelRange){
        fuelRange = settedFuelRange;
    }

    public void setTankCapacity(int settedTankCapacity){
        tankCapacity = settedTankCapacity;
    }

    public void setCurrentGasAmount(int settedCurrentGasAmount){
        currentGasAmount = settedCurrentGasAmount;
    }

    public void setMaxSpeed(int settedMaxSpeed){
        maxSpeed = settedMaxSpeed;
    }

    public void setCurrentSpeed(int settedCurrentSpeed){
        currentSpeed = settedCurrentSpeed;
    }

    public void setDriving(boolean settedDriving){
        driving = settedDriving;
    }
}