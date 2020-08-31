package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.*;

import java.util.*;

public class LogicGameRps implements GameLogic {

    private GameSettings gameSettings;

    private int computerResult = 0;
    private int playerResult = 0;
    private Random random = new Random();

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
    public GameSettings createGameSettings(String username, int winsCount) {
        gameSettings = new GameSettings(username, winsCount);
        return gameSettings;
    }

    @Override
    public Result selectWinner(Artefact playerArtefact, Artefact computerArtefact) {
        if (artefactMapWins.containsKey(playerArtefact) && computerArtefact.equals(artefactMapWins.get(playerArtefact))) {
            return Result.PLAYER_WINS;
        } else if (artefactMapWins.containsKey(computerArtefact) && playerArtefact.equals(artefactMapWins.get(computerArtefact))) {
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
    public Artefact computerSelectionOfArtefact() {
        int randomSelection = random.nextInt(3) + 1;
        return selectionOfArtefact(randomSelection);
    }

    public Artefact selectionOfArtefact(int selection) {
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
