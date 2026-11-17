package library;

public class ExceptionDemo {

    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book();
        book.setTitle("Кобзар");
        library.addBook(book);

        System.out.println("Книга: "
                + library.getBook(0).getTitle());

        library.getBook(105);

        System.out.println("Програма продовжує роботу.");
    }
}
