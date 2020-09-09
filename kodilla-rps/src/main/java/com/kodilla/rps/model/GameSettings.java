package com.kodilla.rps.model;

public class GameSettings {

    private final String username;
    private final int winsCount;


    public GameSettings(String username, int winsCount) {
        this.username = username;
        this.winsCount = winsCount;
    }

    public int getWinsCount() {
        return winsCount;
    }
}
