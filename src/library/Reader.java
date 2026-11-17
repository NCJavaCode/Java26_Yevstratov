package library;

/**
 * Клас Reader представляє читача бібліотеки.
 * Реалізує інтерфейси Nameble та Informable.
 *
 * @author Yevstratov
 * @version 1.0
 */
public class Reader implements Nameble, Informable {

    private String className = "Reader";
    private String name;
    private String phone;

    /**
     * Повертає назву класу.
     * @return назва класу
     */
    @Override
    public String getClassName() {
        return className;
    }

    /**
     * Повертає інформацію про читача.
     * @return інформація про читача
     */
    @Override
    public String getInfo() {
        return "Читач: " + name
                + ", телефон: " + phone;
    }

    /**
     * Повертає ім'я читача.
     * @return ім'я читача
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює ім'я читача.
     * @param name ім'я читача
     */
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name.trim();
        } else {
            this.name = "Невідомий читач";
        }
    }

    /**
     * Повертає номер телефону читача.
     * @return номер телефону
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Встановлює номер телефону читача.
     * @param phone номер телефону
     */
    public void setPhone(String phone) {

        if (phone != null && phone.matches("\\+?[0-9]{10,15}")) {
            this.phone = phone;
        } else {
            System.err.println("Некоректний номер телефону!");
        }
    }

    /**
     * Перевіряє правильність номера телефону.
     * @return true, якщо номер правильний
     */
    public boolean isPhoneValid() {
        return phone != null
                && phone.matches("\\+?[0-9]{10,15}");
    }
}