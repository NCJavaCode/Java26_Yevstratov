package library;

/**
 * Абстрактний клас, який представляє видання.
 *
 * @author Yevstratov
 * @version 1.0
 */
public abstract class Publication {

    private String title;

    /**
     * Повертає назву видання.
     * @return назва видання
     */
    public String getTitle() {
        return title;
    }

    /**
     * Встановлює назву видання.
     * @param title назва видання
     */
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "Без назви";
        }
    }

    /**
     * Повертає тип видання.
     * @return тип видання
     */
    public abstract String getType();
}
