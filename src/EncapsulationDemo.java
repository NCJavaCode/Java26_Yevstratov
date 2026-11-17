import library.Reader;

public class EncapsulationDemo {

    public static void main(String[] args) {

        Reader reader = new Reader();

        reader.setName("Іван");
        reader.setPhone("+380501234567");

        System.out.println("Читач: " + reader.getName());
        System.out.println("Телефон: " + reader.getPhone());
        System.out.println("Коректний номер: "
                + reader.isPhoneValid());

        // Спроба записати неправильний номер
        reader.setPhone("abc123");

        System.out.println("Телефон після перевірки: "
                + reader.getPhone());
    }
}