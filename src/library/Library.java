package library;

/**
 * Клас Library представляє бібліотеку.
 * Зберігає назву, адресу та список книг.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Library implements Cloneable {

    private String name;
    private String address;

    private Book[] books = new Book[100];
    private int bookCount = 0;

    /**
     * Створює порожню бібліотеку.
     */
    public Library() {
    }

    /**
     * Конструктор копіювання бібліотеки.
     * @param original оригінальна бібліотека
     */
    public Library(Library original) {

        this.name = original.name;
        this.address = original.address;
        this.bookCount = original.bookCount;

        this.books = new Book[original.books.length];

        for (int i = 0; i < bookCount; i++) {
            this.books[i] = original.books[i].clone();
        }
    }

    /**
     * Повертає назву бібліотеки.
     * @return назва бібліотеки
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює назву бібліотеки.
     * @param name назва бібліотеки
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Бібліотека";
        }
    }

    /**
     * Повертає адресу бібліотеки.
     * @return адреса бібліотеки
     */
    public String getAddress() {
        return address;
    }

    /**
     * Встановлює адресу бібліотеки.
     * @param address адреса бібліотеки
     */
    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        } else {
            this.address = "Адреса не вказана";
        }
    }

    /**
     * Додає книгу до бібліотеки.
     * @param book книга
     * @return true, якщо книгу додано
     */
    public boolean addBook(Book book) {
        if (book != null && bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Підраховує кількість доступних книг.
     * @return кількість доступних книг
     */
    public int countAvailableBooks() {

        int count = 0;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Шукає книгу за назвою.
     * @param title назва книги
     * @return знайдена книга або null
     */
    public Book findBook(String title) {

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }

        return null;
    }

    /**
     * Повертає книгу за індексом масиву.
     * @param index індекс книги
     * @return книга або null
     */
    public Book getBook(int index) {

        try {
            return books[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println(
                    "Помилка: ArrayIndexOutOfBoundsException");

            System.err.println(
                    "Коректні межі масиву: від 0 до "
                            + (books.length - 1));

            System.err.println(
                    "Некоректний індекс: " + index);

            return null;
        }
    }

    /**
     * Створює глибоку копію бібліотеки.
     * @return копія бібліотеки
     */
    @Override
    public Library clone() {

        try {
            Library copy = (Library) super.clone();

            copy.books = new Book[books.length];

            for (int i = 0; i < bookCount; i++) {
                copy.books[i] = books[i].clone();
            }

            return copy;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
