package com.kodilla.rps.game;



import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.enumgame.RoundResult.*;
import static org.junit.jupiter.api.Assertions.*;

public class GameRpsTestSuite {


    @Test
    void testSelectWinnerPlayer() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic gameRps = new RpsLogic(gameSettings);
        Artefact playerSelect = Artefact.ROCK;
        Artefact computerSelectLost = Artefact.SCISSORS;
        Artefact computerSelectWins = Artefact.PAPER;
        Artefact computerSelectDraw = Artefact.ROCK;
        //When
        RoundResult resultPlayerWins = gameRps.selectWinner(playerSelect, computerSelectLost);
        RoundResult resultPlayerLost = gameRps.selectWinner(playerSelect, computerSelectWins);
        RoundResult resultPlayerDraw = gameRps.selectWinner(playerSelect, computerSelectDraw);
        //Then
        assertEquals(PLAYER_WINS, resultPlayerWins);
        assertEquals(COMPUTER_WINS, resultPlayerLost);
        assertEquals(DRAW, resultPlayerDraw);
    }

}
