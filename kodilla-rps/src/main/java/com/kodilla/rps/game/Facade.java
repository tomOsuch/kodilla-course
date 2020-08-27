package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Result;

public interface Facade {

    void showIntroGame();

    void showResultGame();

    void showGameplayResult(Result result);
}
