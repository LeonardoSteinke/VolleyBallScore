/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Leonardo Steinke
 */
public interface GameScoreObserver {

    void addScore(int team);

    void subScore(int team);

    void resetGame();

    void refreshScore(int x, int y);

}
