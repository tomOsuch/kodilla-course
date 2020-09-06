package com.kodilla.rps.game;



import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;
import java.util.Random;

import static com.kodilla.rps.enumgame.RoundResult.*;
import static org.junit.jupiter.api.Assertions.*;

public class RpsLogicTestSuite {

    @Mock
    Random randomMock;

    @Test
    void testSelectWinner() {
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

    @Test
    void testUpdatePointsAndGetGameResult() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic rpsLogic = new RpsLogic(gameSettings);
        RoundResult playerWins = PLAYER_WINS;
        RoundResult computerWins = COMPUTER_WINS;
        //When
        GameResult resultComputerWinner = rpsLogic.updatePointsAndGetGameResult(computerWins);
        GameResult resultPlayerWinner = rpsLogic.updatePointsAndGetGameResult(playerWins);
        //Then
        assertEquals(GameResult.PLAYER_WINS, resultPlayerWinner);
        assertEquals(GameResult.COMPUTER_WINS, resultComputerWinner);
    }

}
