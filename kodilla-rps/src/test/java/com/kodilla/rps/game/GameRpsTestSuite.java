package com.kodilla.rps.game;



import com.kodilla.rps.model.GameSettings;
import org.junit.jupiter.api.Test;

import static com.kodilla.rps.game.Player.PLAYER;
import static org.junit.jupiter.api.Assertions.*;

public class GameRpsTestSuite {


    @Test
    void testSelectWinnerPlayer() {
        //Given
        GameRps gameRps = new GameRps(0, 0);
        Artefact playerSelect = Artefact.KAMIEN;
        Artefact computerSelect = Artefact.NOZYCE;
        //When
        Player result = gameRps.selectWinner(playerSelect, computerSelect);
        //Then
        assertEquals(PLAYER, result);
    }

    @Test
    void testUpdatePointPlayer() {
        //Given
        GameRps gameRps = new GameRps(0, 0);
        GameSettings gameSettings = new GameSettings("test", 1);
        //When
        boolean updatePointResult = gameRps.updatePoint(PLAYER, gameSettings);
        //Then
        assertTrue(updatePointResult);
    }
}
