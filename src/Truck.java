import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Car {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Грузовик закончил движение");
    }

}
