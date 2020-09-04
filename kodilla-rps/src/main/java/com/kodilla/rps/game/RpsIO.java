package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;

import java.util.Scanner;

public class RpsIO implements GameIO {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public GameSettings promptUserForSettings() {
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        System.out.println("Witaj: " + playerName + "; bedziesz grał do: " + gameCount + " wygranych!");
        return new GameSettings(playerName, gameCount);
    }

    public Artefact promptUserForArtefact() {
        System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
        int selection = scanner.nextInt();
        return selectionOfArtefact(selection);
    }

    public void showPlayerAndComputerSelection(Artefact playerArtefact, Artefact computerArtefact) {
        System.out.println("Twój wybór: " + playerArtefact + "; Komputer: " + computerArtefact);
    }

    @Override
    public void showRoundResult(RoundResult result) {
        if (result == RoundResult.PLAYER_WINS) {
            System.out.println("Wygrałeś rozgrywkę");
        } else if (result == RoundResult.COMPUTER_WINS) {
            System.out.println("Komputer wygrał rozgrywkę");
        } else {
            System.out.println("Remis");
        }
    }

    @Override
    public void showGameResult(GameResult gameResult) {
        if (gameResult == GameResult.PLAYER_WINS){
            System.out.println("------------- BRAWO! Wygrałeś -------------");
        } else {
            System.out.println("Wygrał komputer");
        }
    }

    private Artefact selectionOfArtefact(int selection) {
        switch (selection) {
            case 1:
                return Artefact.ROCK;
            case 2:
                return Artefact.PAPER;
            case 3:
                return Artefact.SCISSORS;
            default:
                return null;
        }
    }
}
