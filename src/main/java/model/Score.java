package model;

import java.util.Objects;

public class Score {
    private int home;
    private int away;

    public Score(){
        home = 0;
        away = 0;
    }
    public Score(int home,int away){
        this.home = home;
        this.away = away;
    }


    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return home == score.home && away == score.away;
    }

    @Override
    public int hashCode() {
        return Objects.hash(home, away);
    }
}
