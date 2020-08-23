package com.kodilla.rps.game;

public interface GameRepository {

    void showIntroGame();

    int playerSelectionGame();

    void manualGame();

    int calculateResultOfGame(int wygrany);

    void showResultGame();
}
