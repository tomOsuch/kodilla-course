package com.kodilla.rps.game;

import java.util.Random;

public class SelectionSettings {

    public Artefact playerSelectionGame(int selectionNumber) {
        return selectionArtefact(selectionNumber);
    }

    public Artefact computerSelectionGame() {
        Random random = new Random();
        int randomSelection = random.nextInt(3) + 1;
        return selectionArtefact(randomSelection);
    }

    public Artefact selectionArtefact(int selection) {
        Artefact artefactSelection = null;
        switch (selection) {
            case 1 -> artefactSelection = Artefact.KAMIEN;
            case 2 -> artefactSelection = Artefact.PAPIER;
            case 3 -> artefactSelection = Artefact.NOZYCE;
        }
        return artefactSelection;
    }
}
