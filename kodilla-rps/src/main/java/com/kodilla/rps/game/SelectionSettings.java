package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;

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
            case 1 -> artefactSelection = Artefact.ROCK;
            case 2 -> artefactSelection = Artefact.PAPER;
            case 3 -> artefactSelection = Artefact.SCISSORS;
        }
        return artefactSelection;
    }
}
