public abstract class Driver {
    String FIO;
    boolean hasLicense;
    int experience;

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public String getFIO() {
        return FIO;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    public Driver(String FIO, boolean hasLicense, int experience) {

        this.FIO = FIO;
        this.hasLicense = hasLicense;
        this.experience = experience;
    }
    abstract void startMoving();

    abstract void stopMoving();

    abstract void refuelCar();
}
