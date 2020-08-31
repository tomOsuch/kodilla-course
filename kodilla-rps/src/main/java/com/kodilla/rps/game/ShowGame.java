package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;

public interface ShowGame {

    void initializeGameSettings();

    void showResultGame();

    Artefact playerSelectionOfArtefact(int selectionNumber);

    void showGameplayResult(Result result);
}
