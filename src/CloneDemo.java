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

        Library copy = original.clone();

        System.out.println("Оригінал: " + original.getName());
        System.out.println("Копія: " + copy.getName());

        copy.setName("Копія бібліотеки");
        copy.findBook("Кобзар").setTitle("Нова назва");

        System.out.println("Книга в оригіналі: "
                + original.findBook("Кобзар").getTitle());

        System.out.println("Книга в копії: "
                + copy.findBook("Нова назва").getTitle());
    }
}
