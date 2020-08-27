package com.kodilla.rps.game;


import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.GameSettings;

public interface Game {

    Result selectWinner(Artefact playerArtefact, Artefact computerArtefact);

    boolean updatePoint(Result wins, GameSettings gameSettings);

}
