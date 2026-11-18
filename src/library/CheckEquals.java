package library;

public class CheckEquals {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Тарас Шевченко");
        book1.setYear(2020);
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setAuthor("Тарас Шевченко");
        book2.setYear(2020);
        book2.setAvailable(true);

        if (book1.equals(book2)) {
            System.out.println("Дорівнює");
        } else {
            System.out.println("Не дорівнює");
        }

        book2.setYear(2025);

        if (book1.equals(book2)) {
            System.out.println("Дорівнює");
        } else {
            System.out.println("Не дорівнює");
        }
    }
}
