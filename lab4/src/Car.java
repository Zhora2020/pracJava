public class Car implements Priceable{
    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Машина: Марка: '" + model + '\'' + ", Цена: " + this.getPrice();
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
