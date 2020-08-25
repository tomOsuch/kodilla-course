package com.kodilla.rps;

import com.kodilla.rps.game.GameRps;

public class RpsRunner {

    public static void main(String[] args) {
        GameRps gameRps = new GameRps(0, 0);

        gameRps.showIntroGame();

        gameRps.startPlayingGame();
    }
}
