package library;

/**
 * Клас Library представляє бібліотеку.
 *
 * Клас зберігає назву бібліотеки, адресу,
 * список книг та кількість доданих книг.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Library {

    private String name;
    private String address;

    private Book[] books = new Book[100];
    private int bookCount = 0;

    /**
     * Повертає назву бібліотеки.
     *
     * @return назва бібліотеки
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює назву бібліотеки.
     *
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
     *
     * @return адреса бібліотеки
     */
    public String getAddress() {
        return address;
    }

    /**
     * Встановлює адресу бібліотеки.
     *
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
     *
     * @param book книга, яку потрібно додати
     * @return true, якщо книгу успішно додано
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
     *
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
     *
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
}