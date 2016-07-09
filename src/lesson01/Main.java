package lesson01;

/**
 * dima
 * 09.07.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.format("Hello %s !", args[0]);

        Car raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();

        System.out.println(raceCar.getSpeed());

        raceCar.getDescription();
        simpleCar.getDescription();
    }
}
