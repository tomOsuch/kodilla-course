package com.kodilla.good.patterns.challenges.shop;

public class User {

    private final String firstname;
    private final String lastname;
    private final String address;
    private final String email;

    public User(String firstname, String lastname, String address, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
