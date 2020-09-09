package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.enumgame.RoundResult.*;
import static org.junit.jupiter.api.Assertions.*;

public class RpsLogicTestSuite {

    @Test
    void testSelectWinner() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic gameRps = new RpsLogic(gameSettings);
        Artefact playerSelectRock = Artefact.ROCK;
        Artefact playerSelectPaper = Artefact.PAPER;
        Artefact playerSelectScissors = Artefact.SCISSORS;
        Artefact computerSelectScissors = Artefact.SCISSORS;
        Artefact computerSelectPaper = Artefact.PAPER;
        Artefact computerSelectRock = Artefact.ROCK;
        //When
        RoundResult resultPlayerWinsRock = gameRps.selectWinner(playerSelectRock, computerSelectScissors);
        RoundResult resultPlayerWinsPaper = gameRps.selectWinner(playerSelectPaper, computerSelectRock);
        RoundResult resultPlayerWinsScissors = gameRps.selectWinner(playerSelectScissors, computerSelectPaper);
        RoundResult resultPlayerLostRock = gameRps.selectWinner(playerSelectRock, computerSelectPaper);
        RoundResult resultPlayerLostPaper = gameRps.selectWinner(playerSelectPaper, computerSelectScissors);
        RoundResult resultPlayerLostScissors = gameRps.selectWinner(playerSelectScissors, computerSelectRock);
        RoundResult resultPlayerDrawRock = gameRps.selectWinner(playerSelectRock, computerSelectRock);
        RoundResult resultPlayerDrawPaper = gameRps.selectWinner(playerSelectPaper, computerSelectPaper);
        RoundResult resultPlayerDrawScissors = gameRps.selectWinner(playerSelectScissors, computerSelectScissors);
        //Then
        assertEquals(PLAYER_WINS, resultPlayerWinsRock);
        assertEquals(PLAYER_WINS, resultPlayerWinsPaper);
        assertEquals(PLAYER_WINS, resultPlayerWinsScissors);
        assertEquals(COMPUTER_WINS, resultPlayerLostRock);
        assertEquals(COMPUTER_WINS, resultPlayerLostPaper);
        assertEquals(COMPUTER_WINS, resultPlayerLostScissors);
        assertEquals(DRAW, resultPlayerDrawRock);
        assertEquals(DRAW, resultPlayerDrawPaper);
        assertEquals(DRAW, resultPlayerDrawScissors);
    }

    @Test
    void testUpdatePointsAndGetGameResultPlayerWins() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic rpsLogic = new RpsLogic(gameSettings);
        //When
        GameResult resultPlayerWinner = rpsLogic.updatePointsAndGetGameResult(PLAYER_WINS);
        //Then
        assertEquals(GameResult.PLAYER_WINS, resultPlayerWinner);
    }

    @Test
    void testUpdatePointsAndGetGameResultComputerWins() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic rpsLogic = new RpsLogic(gameSettings);
        //When
        GameResult resultComputerWinner = rpsLogic.updatePointsAndGetGameResult(COMPUTER_WINS);
        //Then
        assertEquals(GameResult.COMPUTER_WINS, resultComputerWinner);
    }

    @Test
    void testUpdatePointsAndGetGameResultDraw() {
        //Given
        GameSettings gameSettings = new GameSettings("Test", 1);
        RpsLogic rpsLogic = new RpsLogic(gameSettings);
        //When
        GameResult resultDraw = rpsLogic.updatePointsAndGetGameResult(DRAW);
        //Then
        assertEquals(GameResult.NO_RESULT, resultDraw);
    }
}
