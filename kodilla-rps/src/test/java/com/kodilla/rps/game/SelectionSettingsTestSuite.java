package com.kodilla.rps.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSettingsTestSuite {

    @Test
    void testSelectionArtefact() {
        //Given
        SelectionSettings selectionSettings = new SelectionSettings();
        int selection = 1;
        //When
        Artefact result = selectionSettings.selectionArtefact(selection);
        //Then
        assertEquals(Artefact.KAMIEN, result);
    }
}
