package library;

/**
 * Клас Reader представляє читача бібліотеки.
 *
 * Клас зберігає ім'я читача та номер телефону.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Reader {

    private String name;
    private String phone;

    /**
     * Повертає ім'я читача.
     *
     * @return ім'я читача
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює ім'я читача.
     *
     * @param name ім'я читача
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Невідомий читач";
        }
    }

    /**
     * Повертає номер телефону читача.
     *
     * @return номер телефону
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Встановлює номер телефону читача.
     *
     * @param phone номер телефону
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Перевіряє правильність номера телефону.
     *
     * @return true, якщо номер містить допустимі символи
     */
    public boolean isPhoneValid() {

        if (phone == null || phone.isEmpty()) {
            return false;
        }

        int i = 0;

        while (i < phone.length()) {

            char symbol = phone.charAt(i);

            if (!Character.isDigit(symbol) && symbol != '+') {
                return false;
            }

            i++;
        }

        return true;
    }
}