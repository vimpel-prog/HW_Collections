import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mehanic<Truck> Vita = new Mehanic<>("Vita", "Sokolov", "Remont ryadom");
        Driver Serg = new DriverC<>("Serg Sergov",true,10);

        Sponsor gazprom = new Sponsor("Gazprom" , 3_000_000);
        Sponsor lukoil = new Sponsor("Lukoil" , 1_000_000);

        Bus bus1 = new Bus("Ikarus", "b-52", 2.4f);

        Bus bus2 = new Bus("Ikarus", "b-55", 2.6f);
        Bus bus3 = new Bus("Ikarus", "b-57", 2.1f);
        Bus bus4 = new Bus("Ikarus", "b-59", 2.8f);

        Truck truck1 = new Truck("Kamaz", "A3", 3.2f);
        truck1.setDriver(Serg);
        truck1.setMehanic(Vita);
        truck1.setSponsor(lukoil,gazprom );
        Truck truck2 = new Truck("Kamaz", "A3", 3.1f);
        Truck truck3 = new Truck("Kamaz", "A3", 3.8f);

        Truck truck4 = new Truck("Kamaz", "A3", 3.6f);

        PassengerCar passengerCar1 = new PassengerCar("BMW", "X7", 3.2f);
        passengerCar1.setDriver(new DriverB<>("Peta Petr Petrovic", true, 5));
        passengerCar1.setMehanic(new Mehanic<PassengerCar>("Ivan", "Ivanov", "U Ivana"));
        passengerCar1.setSponsor(new Sponsor("Intel", 10000), gazprom);

        PassengerCar passengerCar2 = new PassengerCar("BMW", "X5", 3.0f);
        PassengerCar passengerCar3 = new PassengerCar("BMW", "X4", 3.6f);
        PassengerCar passengerCar4 = new PassengerCar("BMW", "X3", 3.3f);

        List<Car> competingCars = List.of(passengerCar1,truck1);

        for (Car competingCar : competingCars) {
            printInfo(competingCar);
        }

        Sponsor sp = new Sponsor("Ivan Shell", 1000);
        sp.giveMoneyForRace();
        Mehanic<Car> meh = new Mehanic<>("Vita","Borch","U Alika");
        meh.repair(truck3);
        StationTO stationTO = new StationTO();
        stationTO.addCar(passengerCar1);
        stationTO.addTruck(truck1);
        stationTO.makeService();
    }
    private static void printInfo(Car car) {
        System.out.printf("Информация по автомобилю %s %s :%n", car.getBrand(),car.getModel());
        System.out.println("Водители : ");
        for (Driver carDriver : car.getDrivers()) {
            System.out.println(carDriver.FIO);
        }
        System.out.println("Механики : ");
        for (Mehanic<?> mehanic : car.getMehanics()) {
            System.out.println(mehanic.getName()+" "+mehanic.getSurName());
        }
        System.out.println("Спонсоры : ");
        for (Sponsor sponsor : car.getSponsors()) {
            System.out.println(sponsor.getName()+" даёт "+sponsor.getAmount());
        }
    }
}