public class Test {
    public static void main(String[] args) {
        Priceable p = new Ticket("Билет до Москвы", 1400, 2);
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Car(12000000, "Какая-то модель");
        System.out.println(p);
    }
}
