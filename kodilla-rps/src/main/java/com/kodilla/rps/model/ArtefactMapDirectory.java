package com.kodilla.rps.model;

import com.kodilla.rps.enumgame.Artefact;

import java.util.HashMap;
import java.util.Map;


public class ArtefactMapDirectory {
    private Map<Artefact, Artefact> winsMap;

    public ArtefactMapDirectory() {

        winsMap = Map.of(Artefact.PAPER, Artefact.ROCK,
                Artefact.ROCK, Artefact.SCISSORS,
                Artefact.SCISSORS, Artefact.PAPER
        );

    }

    public Map<Artefact, Artefact> getMap() {
        return new HashMap<>(winsMap);
    }
}
