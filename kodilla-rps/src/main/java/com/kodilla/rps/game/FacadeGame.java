package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.Result;
import com.kodilla.rps.model.GameSettings;

import java.util.Scanner;

public class FacadeGame implements Facade {

    private GameSettings gameSettings;
    private GameRps gameRps = new GameRps();

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    @Override
    public void showIntroGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        gameSettings = new GameSettings(playerName, gameCount);
        System.out.println("Witaj: " + playerName + "; bedziesz grał do: " + gameCount + " wygranych!");
    }

    @Override
    public void showResultGame() {
        if (gameRps.getPlayerResult() > gameRps.getComputerResult()){
            System.out.println("------------- BRAWO! Wygrałeś -------------");
        } else {
            System.out.println("Wygrał komputer");
        }
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
}
