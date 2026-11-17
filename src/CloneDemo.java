package library;

public class CloneDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Кобзар");
        book.setAuthor("Тарас Шевченко");
        book.setYear(1840);
        book.setAvailable(true);

        Library original = new Library();
        original.setName("Міська бібліотека");
        original.addBook(book);

        // Клонування через метод clone()
        Library copy1 = original.clone();

        // Клонування через конструктор копіювання
        Library copy2 = new Library(original);

        copy1.findBook("Кобзар").setTitle("Книга 1");
        copy2.findBook("Кобзар").setTitle("Книга 2");

        System.out.println("Оригінал: "
                + original.findBook("Кобзар").getTitle());

        System.out.println("Копія через clone(): "
                + copy1.findBook("Книга 1").getTitle());

        System.out.println("Копія через конструктор: "
                + copy2.findBook("Книга 2").getTitle());
    }
}