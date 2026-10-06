package library;

/**
 * Клас Loan представляє інформацію про видачу книги читачу.
 *
 * Клас зберігає дату видачі, дату повернення
 * та містить методи для визначення статусу і штрафу.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Loan {

    private String issueDate;
    private String returnDate;

    /**
     * Повертає дату видачі книги.
     *
     * @return дата видачі
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Встановлює дату видачі книги.
     *
     * @param issueDate дата видачі
     */
    public void setIssueDate(String issueDate) {

        if (issueDate != null && !issueDate.isEmpty()) {
            this.issueDate = issueDate;
        } else {
            this.issueDate = "Дата не вказана";
        }
    }

    /**
     * Повертає дату повернення книги.
     *
     * @return дата повернення
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Встановлює дату повернення книги.
     *
     * @param returnDate дата повернення
     */
    public void setReturnDate(String returnDate) {

        if (returnDate != null && !returnDate.isEmpty()) {
            this.returnDate = returnDate;
        } else {
            this.returnDate = "Дата не вказана";
        }
    }

    /**
     * Обчислює штраф за прострочення повернення книги.
     *
     * @param overdueDays кількість днів прострочення
     * @return сума штрафу
     */
    public int calculateFine(int overdueDays) {

        int fine;

        if (overdueDays > 0) {
            fine = overdueDays * 5;
        } else {
            fine = 0;
        }

        return fine;
    }

    /**
     * Повертає текстовий статус видачі книги.
     *
     * @param statusCode код статусу
     * @return текстовий опис статусу
     */
    public String getStatus(int statusCode) {

        String status;

        switch (statusCode) {

            case 1:
                status = "Книга видана";
                break;

            case 2:
                status = "Книга повернена";
                break;

            case 3:
                status = "Повернення прострочене";
                break;

            default:
                status = "Статус невідомий";
                break;
        }

        return status;
    }
}