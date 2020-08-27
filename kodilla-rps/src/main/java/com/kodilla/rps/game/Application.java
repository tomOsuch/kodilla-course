package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;

import java.util.Scanner;

public class Application {

    private SelectionSettings selectionSettings = new SelectionSettings();
    private FacadeGame facadeGame = new FacadeGame();
    private GameRps gameRps = new GameRps();

    public void playGame() {
        facadeGame.showIntroGame();
        boolean flaga = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
            int selection = scanner.nextInt();
            Artefact playerArtefact = selectionSettings.playerSelectionGame(selection);
            Artefact computerArtefact = selectionSettings.computerSelectionGame();
            System.out.println("Twój wybór: " + playerArtefact + "; Komputer: " + computerArtefact);
            Result resultGame = gameRps.selectWinner(playerArtefact, computerArtefact);
            facadeGame.showGameplayResult(resultGame);
            if (gameRps.updatePoint(resultGame, facadeGame.getGameSettings())) flaga = true;

        } while (!flaga);
        facadeGame.showResultGame();
    }
}
