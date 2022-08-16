package model;

import java.util.Objects;

public class Game {

    private String homeTeam;
    private String awayTeam;

    private Score score;

    public Game(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = new Score();
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Score getScore(){
       return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return homeTeam.equals(game.homeTeam) && awayTeam.equals(game.awayTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam);
    }
}
