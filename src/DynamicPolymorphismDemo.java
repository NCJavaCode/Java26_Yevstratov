import library.Book;
import library.Magazine;
import library.Newspaper;
import library.Publication;

public class DynamicPolymorphismDemo {

    public static void main(String[] args) {

        Publication book = new Book();
        book.setTitle("Кобзар");

        Publication magazine = new Magazine();
        magazine.setTitle("Наука і життя");

        Publication newspaper = new Newspaper();
        newspaper.setTitle("День");

        Publication[] publications = {
                book, magazine, newspaper
        };

        for (Publication publication : publications) {

            System.out.println("Тип видання: "
                    + publication.getType());

            System.out.println("Назва: "
                    + publication.getTitle());

            System.out.println("-------------------");
        }
    }
}