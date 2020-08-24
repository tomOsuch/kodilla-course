package com.kodilla.rps;

import com.kodilla.rps.game.GameRps;

public class RpsRunner {

    public static void main(String[] args) {
        GameRps gameRps = new GameRps();

        gameRps.showIntroGame();
        gameRps.manualGame();
        gameRps.showResultGame();
    }
}
