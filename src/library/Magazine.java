package library;

/**
 * Клас Magazine представляє журнал.
 * Успадковує клас Publication.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Magazine extends Publication {

    private int issueNumber;

    /**
     * Повертає номер випуску журналу.
     * @return номер випуску
     */
    public int getIssueNumber() {
        return issueNumber;
    }

    /**
     * Встановлює номер випуску журналу.
     * @param issueNumber номер випуску
     */
    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0) {
            this.issueNumber = issueNumber;
        } else {
            this.issueNumber = 1;
        }
    }

    /**
     * Повертає тип видання.
     * @return тип видання
     */
    @Override
    public String getType() {
        return "Журнал";
    }
}
