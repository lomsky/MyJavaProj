package lesson01;

/**
 * dima
 * 09.07.16.
 */
public class SimpleCar extends AbstractCar {

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println(" своё ");
    }

    @Override
    public double getEngineVolume() {
        return 1.7;
    }
}
