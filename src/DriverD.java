public class DriverD<C extends Bus> extends Driver{
    public DriverD(String FIO, boolean hasLicense, int experience) {
        super(FIO, hasLicense, experience);
    }

    void infoDriverAndCar(C car) {
        System.out.println("водитель " + FIO + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель автобуса начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель автобуса завершил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель автобуса заправился");
    }
}
