public class Bus extends Car {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Атобус остановился");
    }




}
