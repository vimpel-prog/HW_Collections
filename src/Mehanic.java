public class Mehanic<T extends Car> {
    private final String name;
    private final String surName;
    private final String company;

    public Mehanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    public void service(T t) {
        System.out.println(t.getBrand()+" прошла ТО");
    }

    public void repair(T t) {
        System.out.println(t.getBrand()+" прошла ремонт");
    }
}
