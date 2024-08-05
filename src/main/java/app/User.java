package app;

import java.nio.file.attribute.UserPrincipal;

class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
        this.address = new Address(); // Створення об'єкта Address
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
