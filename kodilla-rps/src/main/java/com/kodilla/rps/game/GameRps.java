package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.*;

import java.util.*;

public class GameRps implements Game {

    private int computerResult = 0;
    private int playerResult = 0;

    private ArtefactMapDirectory artefactMap = new ArtefactMapDirectory();

    public int getComputerResult() {
        return computerResult;
    }

    public int getPlayerResult() {
        return playerResult;
    }

    @Override
    public Result selectWinner(Artefact playerArtefact, Artefact computerArtefact) {

        Map<Artefact, Artefact> winsWith = artefactMap.getMap();

        if (winsWith.containsKey(playerArtefact) && winsWith.get(playerArtefact).equals(computerArtefact)) {
            return Result.PLAYER_WINS;
        } else if (winsWith.containsKey(computerArtefact) && winsWith.get(computerArtefact).equals(playerArtefact)) {
            return Result.COMPUTER_WINS;
        } else {
            return Result.DRAW;
        }
    }

    @Override
    public boolean updatePoint(Result wins, GameSettings gameSettings) {
        if (wins == Result.PLAYER_WINS) {
            playerResult++;
        } else if (wins == Result.COMPUTER_WINS) {
            computerResult++;
        }
        return playerResult == gameSettings.getWinsCount() || computerResult == gameSettings.getWinsCount();
    }

}
