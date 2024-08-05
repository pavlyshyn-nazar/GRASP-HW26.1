package app;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів
        User user = new User("Назар");
        Address address = new Address();

        // Заповнення адреси
        address.street = "вул. Прикладна";
        address.city = "Львів";
        address.zipCode = "12345";

        // Встановлення адреси для користувача
        user.setAddress(address);

        // Виведення адреси на консоль
        System.out.println("Адреса користувача:");
        System.out.println("Вулиця: " + user.getAddress().street);
        System.out.println("Місто: " + user.getAddress().city);
        System.out.println("Поштовий індекс: " + user.getAddress().zipCode);
    }
}
