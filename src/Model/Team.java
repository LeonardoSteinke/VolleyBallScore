/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Leonardo Steinke
 */
public class Team {

    private int Score;

    private int SetsWons;

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public void addScore() {
        this.Score++;
    }

    public void subScore() {
        this.Score--;
    }

    public int getSetsWons() {
        return SetsWons;
    }

    public void setSetsWons(int SetsWons) {
        this.SetsWons = SetsWons;
    }

}
