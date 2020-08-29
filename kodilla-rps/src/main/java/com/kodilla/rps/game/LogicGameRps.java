package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.*;

import java.util.*;

public class LogicGameRps implements LogicGame {

    private GameSettings gameSettings;

    private int computerResult = 0;
    private int playerResult = 0;

    static Map<Artefact, Artefact> artefactMapWins;

    static {
        artefactMapWins = Map.of(Artefact.PAPER, Artefact.ROCK,
                Artefact.ROCK, Artefact.SCISSORS,
                Artefact.SCISSORS, Artefact.PAPER
        );
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public int getComputerResult() {
        return computerResult;
    }

    public int getPlayerResult() {
        return playerResult;
    }

    @Override
    public void initializingGameSettings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        gameSettings = new GameSettings(playerName, gameCount);
        System.out.println("Witaj: " + playerName + "; bedziesz grał do: " + gameCount + " wygranych!");
    }

    @Override
    public Result selectWinner(Artefact playerArtefact, Artefact computerArtefact) {

        Map<Artefact, Artefact> winsWith = artefactMapWins;

        if (winsWith.containsKey(playerArtefact) && computerArtefact.equals(winsWith.get(playerArtefact))) {
            return Result.PLAYER_WINS;
        } else if (winsWith.containsKey(computerArtefact) && playerArtefact.equals(winsWith.get(computerArtefact))) {
            return Result.COMPUTER_WINS;
        } else {
            return Result.DRAW;
        }
    }

    @Override
    public boolean updatePoint(Result wins) {
        GameSettings settings = getGameSettings();

        if (wins == Result.PLAYER_WINS) {
            playerResult++;
        } else if (wins == Result.COMPUTER_WINS) {
            computerResult++;
        }
        return playerResult == settings.getWinsCount() || computerResult == settings.getWinsCount();
    }

    @Override
    public Artefact playerSelectionArtefact(int selectionNumber) {
        return selectionArtefact(selectionNumber);
    }

    @Override
    public Artefact computerSelectionGame(int number) {
        return selectionArtefact(number);
    }

    private Artefact selectionArtefact(int selection) {
        Artefact artefactSelection = null;
        switch (selection) {
            case 1 -> artefactSelection = Artefact.ROCK;
            case 2 -> artefactSelection = Artefact.PAPER;
            case 3 -> artefactSelection = Artefact.SCISSORS;
        }
        return artefactSelection;
    }
}
