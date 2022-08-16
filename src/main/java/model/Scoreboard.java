package model;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

    List<Game> games;

    public Scoreboard(){
        games = new ArrayList<>();
    }


    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }


    public void startGame(Game game) {
        games.add(game);

    }

    public Score getScore(Game game) {
        return game.getScore();
    }

    public void finishGame(Game game) {
        games.remove(game);
    }
}
