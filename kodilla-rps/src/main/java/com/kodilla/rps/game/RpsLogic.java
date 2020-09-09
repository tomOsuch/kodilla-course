package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.*;

import java.util.*;

public class RpsLogic implements GameLogic {

    private final GameSettings gameSettings;
    private int computerResult = 0;
    private int playerResult = 0;
    private Random random = new Random();

    private static final List<Artefact> artefacts = List.of(Artefact.PAPER, Artefact.ROCK, Artefact.SCISSORS);

    private static final Map<Artefact, Artefact> artefactWinsWith;

    static {
        artefactWinsWith = Map.of(Artefact.PAPER, Artefact.ROCK,
                Artefact.ROCK, Artefact.SCISSORS,
                Artefact.SCISSORS, Artefact.PAPER
        );
    }

    public RpsLogic(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    @Override
    public RoundResult selectWinner(Artefact playerArtefact, Artefact computerArtefact) {
        if (computerArtefact.equals(artefactWinsWith.get(playerArtefact))) {
            return RoundResult.PLAYER_WINS;
        } else if (playerArtefact.equals(artefactWinsWith.get(computerArtefact))) {
            return RoundResult.COMPUTER_WINS;
        } else {
            return RoundResult.DRAW;
        }
    }

    @Override
    public GameResult updatePointsAndGetGameResult(RoundResult roundResult) {
        switch (roundResult) {
            case PLAYER_WINS -> playerResult++;
            case COMPUTER_WINS -> computerResult++;
        }
        if (playerResult == gameSettings.getWinsCount()) return GameResult.PLAYER_WINS;
        else if (computerResult == gameSettings.getWinsCount()) return GameResult.COMPUTER_WINS;
        else return GameResult.NO_RESULT;
    }

    @Override
    public Artefact computerSelectionOfArtefact() {
        return artefacts.get(random.nextInt(artefacts.size()));
    }
}