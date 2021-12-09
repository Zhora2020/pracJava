public class Ticket implements Priceable{
    private String name;
    private double price;
    private double pas;

    public Ticket(String name, double price, double pas) {
        this.name = name;
        this.price = price;
        this.pas = pas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price*pas;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPercent(double percent) {
        this.pas = percent;
    }

    @Override
    public String toString() {
        return "Билет: Название: '" + name + '\'' + ", Цена за 1 билет: " + price + ", Всего билетов: " + pas;
    }
}