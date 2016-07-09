package lesson01;

/**
 * dima
 * 09.07.16.
 */
public class RaceCar extends AbstractCar {
    RaceCar() {
        speed = 200;
    }
@Override
    public double getEngineVolume() {
        return 3.5;
    }
}
