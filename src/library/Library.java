package library;

public class Library {

    private String name;
    private String address;

    private Book[] books = new Book[100];
    private int bookCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Бібліотека";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        } else {
            this.address = "Адреса не вказана";
        }
    }

    public boolean addBook(Book book) {

        if (book != null && bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            return true;
        } else {
            return false;
        }
    }

    public int countAvailableBooks() {

        int count = 0;

        for (int i = 0; i < bookCount; i++) {

            if (books[i].isAvailable()) {
                count++;
            }
        }

        return count;
    }

    public Book findBook(String title) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }

        return null;
    }
}