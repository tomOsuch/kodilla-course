package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;

public class RpsGame {

    private final RpsIO rpsIO = new RpsIO();


    public void playGame() {
        final GameSettings gameSettings = rpsIO.promptUserForSettings();
        RpsLogic rpsLogic = new RpsLogic(gameSettings);
        RoundResult roundResult;
        GameResult gameResult;
        do {
            Artefact playerArtefact = rpsIO.promptUserForArtefact();
            Artefact computerArtefact = rpsLogic.computerSelectionOfArtefact();
            rpsIO.showPlayerAndComputerSelection(playerArtefact, computerArtefact);
            roundResult = rpsLogic.selectWinner(playerArtefact, computerArtefact);
            rpsIO.showRoundResult(roundResult);
        } while ((gameResult = rpsLogic.updatePointsAndGetGameResult(roundResult)) == GameResult.NO_RESULT);
        rpsIO.showGameResult(gameResult);
    }




}
