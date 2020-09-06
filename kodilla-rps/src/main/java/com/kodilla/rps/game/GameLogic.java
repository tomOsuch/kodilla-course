package com.kodilla.rps.game;


import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;

public interface GameLogic {

    RoundResult selectWinner(Artefact playerArtefact, Artefact computerArtefact);

    GameResult updatePointsAndGetGameResult(RoundResult wins);

    Artefact computerSelectionOfArtefact();
}
