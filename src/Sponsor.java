public class Sponsor {
    private final String name;
    private final int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public void giveMoneyForRace() {
        System.out.println(name+" проспонсировал заезд на "+amount);
    }
}
