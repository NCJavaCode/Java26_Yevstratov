import library.Book;
import library.Reader;
import library.Nameble;
import library.Informable;

public class InterfaceDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Кобзар");
        book.setAuthor("Тарас Шевченко");
        book.setYear(2020);

        Reader reader = new Reader();
        reader.setName("Іван");
        reader.setPhone("+380501234567");

        System.out.println("Інтерфейс Nameble:");

        Nameble object = book;
        System.out.println(object.getClassName());

        object = reader;
        System.out.println(object.getClassName());

        System.out.println("-------------------");
        System.out.println("Інтерфейс Informable:");

        Informable info = book;
        System.out.println(info.getInfo());

        info = reader;
        System.out.println(info.getInfo());
    }
}
