package com.kodilla.rps.game;



import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.GameSettings;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.enumgame.Result.PLAYER_WINS;
import static org.junit.jupiter.api.Assertions.*;

public class GameRpsTestSuite {


    @Test
    void testSelectWinnerPlayer() {
        //Given
        GameRps gameRps = new GameRps();
        Artefact playerSelect = Artefact.ROCK;
        Artefact computerSelect = Artefact.SCISSORS;
        //When
        Result result = gameRps.selectWinner(playerSelect, computerSelect);
        //Then
        assertEquals(PLAYER_WINS, result);
    }

    @Test
    void testUpdatePointPlayer() {
        //Given
        GameRps gameRps = new GameRps();
        GameSettings gameSettings = new GameSettings("test", 1);
        //When
        boolean updatePointResult = gameRps.updatePoint(PLAYER_WINS, gameSettings);
        //Then
        assertTrue(updatePointResult);
    }
}
