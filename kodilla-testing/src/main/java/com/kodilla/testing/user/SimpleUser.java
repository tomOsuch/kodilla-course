package com.kodilla.testing.user;

public class SimpleUser {
    String username;
    String realName;

    public SimpleUser(String usernameame) {
        this.username = usernameame;
    }

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
