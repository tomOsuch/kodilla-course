package com.kodilla.good.patterns.food2door;

public class User {

    private final int id;
    private final String username;
    private final String password;
    private final String email;
    private final String address;

    public User(int id, String username, String password, String email, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
