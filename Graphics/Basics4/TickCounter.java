package Basics4;

public class TickCounter{
    int ticks;

    public int getCurrentTicks(){
        return ticks;
    }

    public void oneTick(){
        ticks += 1;
    }

    public void twoTicks(){
        ticks += 2;
    }

    public void threeTicks(){
        ticks += 3;
    }
}