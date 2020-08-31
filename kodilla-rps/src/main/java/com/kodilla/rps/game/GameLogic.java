package com.kodilla.rps.game;


import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.GameSettings;

public interface GameLogic {

    GameSettings createGameSettings(String username, int winsCount);

    Result selectWinner(Artefact playerArtefact, Artefact computerArtefact);

    boolean updatePoint(Result wins);

    Artefact computerSelectionOfArtefact();
}
