package library;

import java.util.Objects;

/**
 * Клас Book представляє книгу у бібліотечній системі.
 * Успадковує клас Publication.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Book extends Publication implements Cloneable {

    private String author;
    private int year;
    private boolean available;

    /**
     * Повертає тип видання.
     * @return тип видання
     */
    @Override
    public String getType() {
        return "Книга";
    }

    /**
     * Повертає автора книги.
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Встановлює автора книги.
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
     * Повертає рік видання.
     * @return рік видання
     */
    public int getYear() {
        return year;
    }

    /**
     * Встановлює рік видання.
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
     * Перевіряє доступність книги.
     * @return стан доступності
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Встановлює доступність книги.
     * @param available стан доступності
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Обчислює вік книги.
     * @param currentYear поточний рік
     * @return вік книги
     */
    public int getBookAge(int currentYear) {
        return currentYear - year;
    }

    /**
     * Видача книги читачу.
     */
    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    /**
     * Повернення книги.
     */
    public void returnBook() {
        available = true;
    }

    /**
     * Порівнює книги між собою.
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
                && Objects.equals(getTitle(), book.getTitle())
                && Objects.equals(author, book.author);
    }

    /**
     * Повертає хеш-код книги.
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), author, year, available);
    }

    /**
     * Створює копію об'єкта книги.
     * @return копія книги
     */
    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}