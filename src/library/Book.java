package library;

import java.util.Objects;

/**
 * Клас Book представляє книгу у бібліотечній системі.
 *
 * Клас зберігає інформацію про назву книги,
 * автора, рік видання та доступність книги.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Book {

    private String title;
    private String author;
    private int year;
    private boolean available;

    /**
     * Повертає назву книги.
     *
     * @return назва книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Встановлює назву книги.
     *
     * @param title назва книги
     */
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "Без назви";
        }
    }

    /**
     * Повертає автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Встановлює автора книги.
     *
     * @param author автор книги
     */
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            this.author = "Автор невідомий";
        }
    }

    /**
     * Повертає рік видання книги.
     *
     * @return рік видання
     */
    public int getYear() {
        return year;
    }

    /**
     * Встановлює рік видання книги.
     *
     * @param year рік видання
     */
    public void setYear(int year) {
        if (year > 0 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    /**
     * Повертає стан доступності книги.
     *
     * @return true, якщо книга доступна
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Встановлює стан доступності книги.
     *
     * @param available стан доступності книги
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Обчислює вік книги.
     *
     * @param currentYear поточний рік
     * @return вік книги у роках
     */
    public int getBookAge(int currentYear) {
        return currentYear - year;
    }

    /**
     * Позначає книгу як видану читачу.
     */
    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    /**
     * Позначає книгу як повернену до бібліотеки.
     */
    public void returnBook() {
        available = true;
    }

    /**
     * Порівнює поточну книгу з іншим об'єктом.
     *
     * @param obj об'єкт для порівняння
     * @return true, якщо книги однакові
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return year == book.year
                && available == book.available
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    /**
     * Повертає хеш-код книги.
     *
     * @return хеш-код книги
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, available);
    }
}