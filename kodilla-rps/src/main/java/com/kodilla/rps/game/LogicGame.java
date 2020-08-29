package com.kodilla.rps.game;


import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;

public interface LogicGame {

    void initializingGameSettings();

    Result selectWinner(Artefact playerArtefact, Artefact computerArtefact);

    boolean updatePoint(Result wins);

    Artefact playerSelectionArtefact(int selectionNumber);

    Artefact computerSelectionGame(int number);
}
