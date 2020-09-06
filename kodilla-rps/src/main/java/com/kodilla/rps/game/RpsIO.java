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

    @Override
    public Artefact promptUserForArtefact() {
        System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
        int selection = scanner.nextInt();
        return selectionOfArtefact(selection);
    }

    @Override
    public void showPlayerAndComputerSelection(Artefact playerArtefact, Artefact computerArtefact) {
        System.out.println("Twój wybór: " + playerArtefact + "; Komputer: " + computerArtefact);
    }

    @Override
    public void showRoundResult(RoundResult result) {
        System.out.println(
                switch (result) {
                    case PLAYER_WINS -> "Wygrałeś rozgrywkę";
                    case COMPUTER_WINS -> "Komputer wygrał rozgrywkę";
                    case DRAW -> "Remis";
                }
        );
    }

    @Override
    public void showGameResult(GameResult gameResult) {
        System.out.println(
                switch (gameResult) {
                    case PLAYER_WINS -> "------------- BRAWO! Wygrałeś -------------";
                    case COMPUTER_WINS -> "Komputer wygrał";
                    case NO_RESULT -> "Brak zwycięzcy :(";
                }
        );
    }

    private Artefact selectionOfArtefact(int selection) {
        return switch (selection) {
            case 1 -> Artefact.ROCK;
            case 2 -> Artefact.PAPER;
            case 3 -> Artefact.SCISSORS;
            default -> null;
        };
    }
}
