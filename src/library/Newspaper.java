package library;

/**
 * Клас Newspaper представляє газету.
 * Успадковує клас Publication.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Newspaper extends Publication {

    private String publicationDate;

    /**
     * Повертає дату випуску газети.
     * @return дата випуску
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Встановлює дату випуску газети.
     * @param publicationDate дата випуску
     */
    public void setPublicationDate(String publicationDate) {
        if (publicationDate != null
                && !publicationDate.isBlank()) {
            this.publicationDate = publicationDate;
        } else {
            this.publicationDate = "Дата не вказана";
        }
    }

    /**
     * Повертає тип видання.
     * @return тип видання
     */
    @Override
    public String getType() {
        return "Газета";
    }
}