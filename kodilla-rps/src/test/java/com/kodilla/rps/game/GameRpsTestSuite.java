package com.kodilla.rps.game;



import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.enumgame.Result.*;
import static org.junit.jupiter.api.Assertions.*;

public class GameRpsTestSuite {


    @Test
    void testSelectWinnerPlayer() {
        //Given
        LogicGameRps gameRps = new LogicGameRps();
        Artefact playerSelect = Artefact.ROCK;
        Artefact computerSelectLost = Artefact.SCISSORS;
        Artefact computerSelectWins = Artefact.PAPER;
        Artefact computerSelectDraw = Artefact.ROCK;
        //When
        Result resultPlayerWins = gameRps.selectWinner(playerSelect, computerSelectLost);
        Result resultPlayerLost = gameRps.selectWinner(playerSelect, computerSelectWins);
        Result resultPlayerDraw = gameRps.selectWinner(playerSelect, computerSelectDraw);
        //Then
        assertEquals(PLAYER_WINS, resultPlayerWins);
        assertEquals(COMPUTER_WINS, resultPlayerLost);
        assertEquals(DRAW, resultPlayerDraw);
    }

    @Test
    void testPlayerSelectionArtefact() {
        //Given
        LogicGameRps gameRps = new LogicGameRps();
        int selection1 = 1;
        int selection2 = 2;
        int selection3 = 3;
        //When
        Artefact result1 = gameRps.playerSelectionOfArtefact(selection1);
        Artefact result2 = gameRps.playerSelectionOfArtefact(selection2);
        Artefact result3 = gameRps.playerSelectionOfArtefact(selection3);
        //Then
        assertEquals(Artefact.ROCK, result1);
        assertEquals(Artefact.PAPER, result2);
        assertEquals(Artefact.SCISSORS, result3);
    }
}
