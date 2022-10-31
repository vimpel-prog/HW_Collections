public class DriverC<C extends Truck> extends Driver  {
    public DriverC(String FIO, boolean hasLicense, int experience) {
        super(FIO, hasLicense, experience);
    }

    void infoDriverAndCar(C car) {
        System.out.println("водитель " + FIO + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }


    @Override
    public void startMoving() {
        System.out.println("Водитель грузовой машины начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель грузовой машины завершил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель грузовой машины заправился");
    }
}
