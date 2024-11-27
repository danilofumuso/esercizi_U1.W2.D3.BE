package shop;

public class Customer {
    private String name;
    private int tier;

    public Customer(String name, int tier) {
        this.name = name;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return name +
                "\nTier:" + tier;
    }
}
