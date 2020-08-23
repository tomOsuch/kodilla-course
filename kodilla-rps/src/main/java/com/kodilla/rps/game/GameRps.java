package com.kodilla.rps.game;

import com.kodilla.rps.model.PlayerState;

import java.util.Random;
import java.util.Scanner;

public class GameRps implements GameRepository {

    private final int kamien = 1;
    private final int papier = 2;
    private final int nozyce = 3;
    private PlayerState playerState;

    @Override
    public void showIntroGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gra Kamień, Nożyce, Papier");
        System.out.println("Podaj nazwę gracza");
        String playerName = scanner.nextLine();
        System.out.println("Wskasz do jakiej liczby wygranych chcesz grać");
        int gameCount = scanner.nextInt();
        playerState = new PlayerState(playerName, gameCount);
        System.out.println("Witaj: " + playerState.getUsername() + "; bedziesz grał do: " + playerState.getGameCount() + " wygranych!");
    }

    @Override
    public int playerSelectionGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wybór : 1 - kamień, 2 - papier, 3 - nożyce");
        int playerSelection = scanner.nextInt();
        System.out.print("WTwój wybór to: ");
        switch (playerSelection) {
            case kamien -> System.out.println("Kamien.");
            case papier -> System.out.println("Papier.");
            case nozyce -> System.out.println("Nozyczki.");
        }
        return playerSelection;
    }

    @Override
    public void manualGame() {
        int count = 1;
        do {
            Random random = new Random();
            int computerSelectionGame = random.nextInt(3) + 1;
            int player = playerSelectionGame();
            System.out.print("Wybór komputera: ");
            switch (computerSelectionGame) {
                case kamien:
                    System.out.println("Kamień");
                    if (player == papier) {
                        System.out.println("Wygrałeś");
                    } else if (player == nozyce) {
                        System.out.println("Przegrałeś");
                    } else {
                        System.out.println("Remis");
                    }
                    break;
                case papier:
                    System.out.println("Papier");
                    if (player == kamien) {
                        System.out.println("Przegrałeś");
                    } else if (player == nozyce) {
                        System.out.println("Wygrałeś");
                    } else {
                        System.out.println("Remis");
                    }
                    break;
                case nozyce:
                    System.out.println("Nożyce");
                    if (player == kamien) {
                        System.out.println("Wygrałeś");
                    } else if (player == papier) {
                        System.out.println("Przegrałeś");
                    } else {
                        System.out.println("Remis");
                    }
            }

            count++;
        } while (count == playerState.getGameCount()) ;

    }

    @Override
    public int calculateResultOfGame(int wygrany) {
        int wins = 0;

        return wins;
    }

    @Override
    public void showResultGame() {

    }
}
