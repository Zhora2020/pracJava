public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("Создание книги конструктором по умолчанию:");
        System.out.println(b + "\n");
        Book b1 = new Book("Книга 0", "Автор 0");
        System.out.println("Создание книги конструктором с частичной инициализацией:");
        System.out.println(b1 + "\n");
        Book b2 = new Book("Название 1", "Автор 1", "Издатель 1", 100, 2005);
        System.out.println("Создание книги консруктором со всеми полями:");
        System.out.println(b2 + "\n");
        System.out.println("Издательство: " + b2.getPublisher());
        System.out.println("Год публикации: " + b2.getPublishYear());
        System.out.println("Изменение количества экземпляров на 20:");
        b2.setEdition(20);
        System.out.println(b2 + "\n");
        System.out.println("Издательство: " + b2.getPublisher());
        System.out.println("Год публикации: " + b2.getPublishYear() + "\n");
        System.out.println("Изменение количества книг на 0:");
        b2.setEdition(0);
        System.out.println(b2 + "\n");
        System.out.println("Изменение количества книг на 20:");
        b2.setEdition(20);
        System.out.println(b2);
    }
}
