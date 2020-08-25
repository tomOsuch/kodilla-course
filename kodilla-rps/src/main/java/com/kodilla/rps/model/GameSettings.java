package com.kodilla.rps.model;

public class GameSettings {

    private String username;
    private int winsCount;


    public GameSettings(String username, int winsCount) {
        this.username = username;
        this.winsCount = winsCount;
    }

    public String getUsername() {
        return username;
    }

    public int getWinsCount() {
        return winsCount;
    }

}
