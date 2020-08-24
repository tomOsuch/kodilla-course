package com.kodilla.rps.model;

public class PlayerState {

    private String username;
    private int gameCount;


    public PlayerState(String username, int gameCount) {
        this.username = username;
        this.gameCount = gameCount;
    }

    public String getUsername() {
        return username;
    }

    public int getGameCount() {
        return gameCount;
    }

}
