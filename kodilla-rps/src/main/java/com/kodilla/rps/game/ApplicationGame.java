package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;

import java.util.Scanner;

public class ApplicationGame {

    private ShowGameRps facadeGame = new ShowGameRps();
    private LogicGameRps gameRps;

    public void playGame() {
        gameRps = facadeGame.getGameRps();
        facadeGame.initializeGameSettings();
        Result resultGame;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
            int selection = scanner.nextInt();
            Artefact playerArtefact = facadeGame.playerSelectionOfArtefact(selection);
            Artefact computerArtefact = gameRps.computerSelectionOfArtefact();
            System.out.println("Twój wybór: " + playerArtefact + "; Komputer: " + computerArtefact);
            resultGame = gameRps.selectWinner(playerArtefact, computerArtefact);
            facadeGame.showGameplayResult(resultGame);
        } while (!gameRps.updatePoint(resultGame));
        facadeGame.showResultGame();
    }
}
