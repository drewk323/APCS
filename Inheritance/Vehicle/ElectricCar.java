package Vehicle;

public class ElectricCar extends Car{
    protected int batteryCapacity = 0;
    protected int currentCharge = 0;

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public int getCurrentCharge(){
        return currentCharge;
    }

    public void setBatteryCapacity(int settedBatteryCapacity){
        batteryCapacity = settedBatteryCapacity;
    }

    public void setCurrentCharge(int settedCurrentCharge){
        currentCharge = settedCurrentCharge;
    }

    @Override
    public int getTankCapacity(){
        System.out.println("There is no tank in an electric car.");
        return 0;
    }

    @Override
    public int getFuelRange(){
        System.out.println("There is no gas fuel tank in an electric car.");
        return 0;
    }

    @Override
    public int getCurrentGasAmount(){
        System.out.println("There is no gas amount in an electric car.");
        return 0;
    }

}
