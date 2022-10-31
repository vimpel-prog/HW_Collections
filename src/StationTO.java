import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StationTO {
    private final Queue<Car> carToService = new ArrayDeque<>();

    private void add(Car car) {
        carToService.offer(car);
    }

    public void addCar(PassengerCar car) {
        add(car);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void makeService() {
        if (!carToService.isEmpty()) {
            Car car = carToService.poll();
            new Mehanic<>("Pipa", "Pupa","FIRMA").repair(car);
        }
    }
}
