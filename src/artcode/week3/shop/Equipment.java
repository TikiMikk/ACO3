package artcode.week3.shop;

public abstract class Equipment {

    private String model;
    private int price;

    public Equipment(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public abstract void test();

    @Override
    public String toString() {
        return "Equipment: " + model +
                ", price " + price;
    }
}
