import library.Book;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import static org.junit.Assert.*;

public class BookTest {

    @BeforeClass
    public static void start() {
        System.out.println("Початок тестування Book");
    }

    @Test
    public void testTitle() {
        Book book = new Book();
        book.setTitle("Кобзар");

        assertEquals("Кобзар", book.getTitle());
    }

    @Test
    public void testAvailable() {
        Book book = new Book();
        book.setAvailable(true);

        assertTrue(book.isAvailable());
    }

    @Test
    public void testBookAge() {
        Book book = new Book();
        book.setYear(2020);

        assertEquals(6, book.getBookAge(2026));
    }

    @Test
    public void testEmptyAuthor() {
        Book book = new Book();

        assertNull(book.getAuthor());
    }

    @Test
    public void testEquals() {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle("Кобзар");
        book2.setTitle("Кобзар");

        assertTrue(book1.equals(book2));
        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @AfterClass
    public static void finish() {
        System.out.println("Тестування Book завершено");
    }
}