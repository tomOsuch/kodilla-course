package com.kodilla.rps.game;

import com.kodilla.rps.model.*;

import java.util.*;

public class GameRps implements Game {

    private int computerResult;
    private int playerResult;

    public GameRps(int computerResult, int playerResult) {
        this.computerResult = computerResult;
        this.playerResult = playerResult;
    }

    private GameSettings gameSettings;
    private SelectionSettings selectionSettings = new SelectionSettings();


    @Override
    public GameSettings showIntroGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        gameSettings = new GameSettings(playerName, gameCount);
        System.out.println("Witaj: " + gameSettings.getUsername() + "; bedziesz grał do: " + gameSettings.getWinsCount() + " wygranych!");
        return  gameSettings;
    }

    @Override
    public void startPlayingGame() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
            int selection = scanner.nextInt();
            Artefact player = selectionSettings.playerSelectionGame(selection);
            Artefact computer = selectionSettings.computerSelectionGame();
            updatePoint(selectWinner(player, computer), gameSettings);
        } while (playerResult != gameSettings.getWinsCount() && computerResult != gameSettings.getWinsCount());
        showResultGame();
    }

    @Override
    public void showResultGame() {
        if (playerResult > computerResult){
            System.out.println("------------- BRAWO!! " + gameSettings.getUsername() + " -------------");
        } else {
            System.out.println("Wygrał komputer");
        }
    }

    public Player selectWinner(Artefact playerArtefact, Artefact computerArtefact) {

        Map<Artefact, Set<Artefact>> winsWith = new HashMap<>();
        Set<Artefact> artefactWinsofPapier = new HashSet<>();
        Set<Artefact> artefactWinsofKamien = new HashSet<>();
        Set<Artefact> artefactWinsofNozyce = new HashSet<>();
        artefactWinsofPapier.add(Artefact.KAMIEN);
        artefactWinsofKamien.add(Artefact.NOZYCE);
        artefactWinsofNozyce.add(Artefact.PAPIER);
        winsWith.put(Artefact.PAPIER, artefactWinsofPapier);
        winsWith.put(Artefact.KAMIEN, artefactWinsofKamien);
        winsWith.put(Artefact.NOZYCE, artefactWinsofNozyce);

        System.out.println(playerArtefact + "; Komputer: " + computerArtefact);

        if (winsWith.containsKey(playerArtefact) && winsWith.get(playerArtefact).contains(computerArtefact)) {
            System.out.println("Wygrałeś");
            return Player.PLAYER;
        } else if (winsWith.containsKey(computerArtefact) && winsWith.get(computerArtefact).contains(playerArtefact)) {
            System.out.println("Wygrał komputer");
            return Player.COMPUTER;
        } else {
            System.out.println("Remis");
            return Player.REMIS;
        }
    }

    public boolean updatePoint(Player wins, GameSettings gameSettings) {
        if (wins == Player.PLAYER) {
            playerResult++;
        } else if (wins == Player.COMPUTER) {
            computerResult++;
        }
        return playerResult == gameSettings.getWinsCount() || computerResult == gameSettings.getWinsCount();
    }
}
