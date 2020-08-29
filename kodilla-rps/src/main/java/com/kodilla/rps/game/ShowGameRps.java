package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Result;

public class ShowGameRps implements ShowGame {

    private LogicGameRps gameRps = new LogicGameRps();

    public LogicGameRps getGameRps() {
        return gameRps;
    }

    @Override
    public void showResultGame() {
        if (gameRps.getPlayerResult() > gameRps.getComputerResult()){
            System.out.println("------------- BRAWO! Wygrałeś -------------");
        } else {
            System.out.println("Wygrał komputer");
        }
    }

    @Override
    public void showGameplayResult(Result result) {
        if (result == Result.PLAYER_WINS) {
            System.out.println("Wygrałeś rozgrywkę");
        } else if (result == Result.COMPUTER_WINS) {
            System.out.println("Komputer wygrał rozgrywkę");
        } else {
            System.out.println("Remis");
        }
    }
}
