package library;

public class Loan {

    private String issueDate;
    private String returnDate;

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {

        if (issueDate != null && !issueDate.isEmpty()) {
            this.issueDate = issueDate;
        } else {
            this.issueDate = "Дата не вказана";
        }
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {

        if (returnDate != null && !returnDate.isEmpty()) {
            this.returnDate = returnDate;
        } else {
            this.returnDate = "Дата не вказана";
        }
    }

    public int calculateFine(int overdueDays) {

        int fine;

        if (overdueDays > 0) {
            fine = overdueDays * 5;
        } else {
            fine = 0;
        }

        return fine;
    }

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
