import library.Book;
import library.Library;

public class ExceptionDemo {

    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book();
        book.setTitle("Кобзар");
        library.addBook(book);

        System.out.println("Книга: "
                + library.getBook(0).getTitle());

        // Перевірка виходу за межі масиву
        library.getBook(105);

        // Перевірка відсутнього об'єкта
        library.addBook(null);

        System.out.println("Програма продовжує роботу.");
    }
}