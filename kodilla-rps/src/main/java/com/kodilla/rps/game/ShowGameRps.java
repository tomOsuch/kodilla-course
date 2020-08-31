package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Artefact;
import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.GameSettings;

import java.util.Scanner;

public class ShowGameRps implements ShowGame {

    private LogicGameRps gameRps = new LogicGameRps();
    private GameSettings gameSettings;

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public LogicGameRps getGameRps() {
        return gameRps;
    }

    @Override
    public void initializeGameSettings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        gameSettings = gameRps.createGameSettings(playerName, gameCount);
        System.out.println("Witaj: " + playerName + "; bedziesz grał do: " + gameCount + " wygranych!");
    }

    @Override
    public Artefact playerSelectionOfArtefact(int selectionNumber) {
        return gameRps.selectionOfArtefact(selectionNumber);
    }

    @Override
    public void showGameplayResult(Result result) {
        if (result == Result.PLAYER_WINS) {
            System.out.println("Wygrałeś rozgrywkę");
        } else if (result == Result.COMPUTER_WINS) {
            System.out.println("Komputer wygrał rozgrywkę");
        } else {
            System.out.println("Remis");
        }
    }

    @Override
    public void showResultGame() {
        if (gameRps.getPlayerResult() > gameRps.getComputerResult()){
            System.out.println("------------- BRAWO! Wygrałeś -------------");
        } else {
            System.out.println("Wygrał komputer");
        }
    }
}
