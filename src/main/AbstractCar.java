package main;

/**
 * dima
 * 09.07.16.
 */
public abstract class AbstractCar implements Car {
    protected int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 12;
    }

    public void getDescription() {
        System.out.println(this.getClass().getSimpleName() + "( speed " + speed
                    + ", Eng vol: " + getEngineVolume() + " )");
    }

//    public double getEngineVolume()
//    {
//
//    }
}
