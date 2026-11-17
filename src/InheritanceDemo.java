import library.Book;
import library.Magazine;
import library.Newspaper;
import library.Publication;

public class InheritanceDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Кобзар");
        book.setAuthor("Тарас Шевченко");

        Magazine magazine = new Magazine();
        magazine.setTitle("Наука і життя");
        magazine.setIssueNumber(5);

        Newspaper newspaper = new Newspaper();
        newspaper.setTitle("День");
        newspaper.setPublicationDate("17.11.2026");

        Publication[] publications = {
                book, magazine, newspaper
        };

        for (Publication publication : publications) {
            System.out.println("Тип: "
                    + publication.getType());

            System.out.println("Назва: "
                    + publication.getTitle());

            System.out.println("-------------------");
        }

        System.out.println("Автор книги: "
                + book.getAuthor());

        System.out.println("Номер журналу: "
                + magazine.getIssueNumber());

        System.out.println("Дата випуску газети: "
                + newspaper.getPublicationDate());
    }
}