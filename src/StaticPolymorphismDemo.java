import library.Book;

public class StaticPolymorphismDemo {

    public static void main(String[] args) {

        Book book = new Book();

        book.setTitle("Кобзар");
        book.setYear(2020);

        System.out.println("Назва книги: "
                + book.getTitle());

        System.out.println("Рік видання: "
                + book.getYear());

        // Метод без параметрів
        System.out.println("Вік книги сьогодні: "
                + book.getBookAge());

        // Метод з параметром
        System.out.println("Вік книги у 2030 році: "
                + book.getBookAge(2030));

        System.out.println("Вік книги у 2025 році: "
                + book.getBookAge(2025));
    }
}
