import library.Book;
import library.Library;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import static org.junit.Assert.*;

public class LibraryTest {

    @BeforeClass
    public static void start() {
        System.out.println("Початок тестування Library");
    }

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book();

        assertTrue(library.addBook(book));
    }

    @Test
    public void testFindBook() {
        Library library = new Library();
        Book book = new Book();
        book.setTitle("Кобзар");

        library.addBook(book);

        assertEquals(book, library.findBook("Кобзар"));
    }

    @Test
    public void testMissingBook() {
        Library library = new Library();

        assertNull(library.findBook("Невідома книга"));
    }

    @Test
    public void testAvailableBooks() {
        Library library = new Library();
        Book book = new Book();

        book.setAvailable(true);
        library.addBook(book);

        assertEquals(1, library.countAvailableBooks());
    }

    @Test
    public void testWrongIndex() {
        Library library = new Library();

        assertNull(library.getBook(105));
    }

    @Test(expected = NullPointerException.class)
    public void testNullException() {
        Library library = new Library((Library) null);
    }

    @AfterClass
    public static void finish() {
        System.out.println("Тестування Library завершено");
    }
}
