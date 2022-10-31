import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private float engineVolume;
    List<Car> competingCars;
    public final List<Driver> drivers = new ArrayList<>();
    public final List<Mehanic<?>> mehanics = new ArrayList<>();
    public final List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, float engineVolume) {
        this.brand = validValue(brand);
        this.model = validValue(model);
        this.engineVolume = Math.max(engineVolume, 1f);
    }

    public void setDriver(Driver driver) {
        drivers.add(driver);
    }
    public void setMehanic(Mehanic<?> mehanic) {
        mehanics.add(mehanic);
    }
    public void setSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mehanic<?>> getMehanics() {
        return mehanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    abstract void startMoving();

    abstract void finishMoving();

    private String validValue(String value) {
        return value != null && !value.isBlank() ? value : "default";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
