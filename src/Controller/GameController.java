/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Team;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Steinke
 */
public class GameController {

    private GameController() {
        team1 = new Team();
        team2 = new Team();

    }

    private static GameController instance = null;

    public static GameController getIntance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    private int set;
    private List<String> list = new ArrayList();
    private Team team1;
    private Team team2;

    private int getSet() {
        return set;
    }

    private void addSet() {
        this.set++;
    }

    public void addScore(int i) {
        switch (i) {
            case 1:
                team1.addScore();
                break;
            case 2:
                team2.addScore();
                break;
        }

        notifyRefreshScore();

    }

    public void subScore(int i) {
        switch (i) {
            case 1:
                team1.subScore();
                break;
            case 2:
                team2.subScore();
                break;
        }

        notifyRefreshScore();

    }

    private List<GameScoreObserver> addGameScoreObserver = new ArrayList<>();

    public void attach(GameScoreObserver obs) {
        this.addGameScoreObserver.add(obs);
    }

    public void detach(GameScoreObserver obs) {
        this.addGameScoreObserver.remove(obs);
    }

    private void notifyAddScore(int i) {
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.addScore(i);
        }
    }

    private void notifyRefreshScore() {
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.refreshScore(team1.getScore(), team2.getScore());
        }
    }

}
