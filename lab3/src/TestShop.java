public class TestShop {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);
        shop.add(new Chair("Пластиковый стул", 1, 0.9, 0.6, "Пластик", "Пластик", true, 1300));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(5));
        System.out.println(shop.getPrices());

    }
}