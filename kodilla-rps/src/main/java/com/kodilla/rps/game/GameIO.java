package com.kodilla.rps.game;

import com.kodilla.rps.enumgame.GameResult;
import com.kodilla.rps.enumgame.RoundResult;
import com.kodilla.rps.model.GameSettings;

public interface GameIO {

    GameSettings promptUserForSettings();

    void showGameResult(GameResult gameResult);

    void showRoundResult(RoundResult result);
}
