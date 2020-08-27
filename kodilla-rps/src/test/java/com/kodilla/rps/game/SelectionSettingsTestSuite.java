package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSettingsTestSuite {

    @Test
    void testSelectionArtefact() {
        //Given
        SelectionSettings selectionSettings = new SelectionSettings();
        int selection1 = 1;
        int selection2 = 2;
        int selection3 = 3;
        //When
        Artefact result1 = selectionSettings.selectionArtefact(selection1);
        Artefact result2 = selectionSettings.selectionArtefact(selection2);
        Artefact result3 = selectionSettings.selectionArtefact(selection3);
        //Then
        assertEquals(Artefact.ROCK, result1);
        assertEquals(Artefact.PAPER, result2);
        assertEquals(Artefact.SCISSORS, result3);
    }
}
