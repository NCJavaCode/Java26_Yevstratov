package library;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "Без назви";
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            this.author = "Автор невідомий";
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBookAge(int currentYear) {
        return currentYear - year;
    }

    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    public void returnBook() {
        available = true;
    }
}