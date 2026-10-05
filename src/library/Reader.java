package library;

public class Reader {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Невідомий читач";
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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