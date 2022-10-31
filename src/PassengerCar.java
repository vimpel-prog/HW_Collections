import java.util.concurrent.ThreadLocalRandom;

public class PassengerCar extends Car  {

    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Машина начала движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Машина остановилась");
    }

}
