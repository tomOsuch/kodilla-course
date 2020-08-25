package com.kodilla.rps.game;

import com.kodilla.rps.model.GameSettings;

public interface Game {

    GameSettings showIntroGame();

    void startPlayingGame();

    void showResultGame();
}
