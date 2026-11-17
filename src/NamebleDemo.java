import library.Book;
import library.Reader;
import library.Nameble;

public class NamebleDemo {

    public static void main(String[] args) {

        Nameble book = new Book();
        Nameble reader = new Reader();

        System.out.println("Назва класу: "
                + book.getClassName());

        System.out.println("Назва класу: "
                + reader.getClassName());
    }
}