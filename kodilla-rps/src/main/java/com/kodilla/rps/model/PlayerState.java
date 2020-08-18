package com.kodilla.rps.model;

public class PlayerState {

    private String username;
    private int gameCount;
    private int stateGame = 0;

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

    public int getStateGame() {
        return stateGame;
    }
}
