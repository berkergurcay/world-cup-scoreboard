package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        if(games.contains(game)){
            games.remove(game);
        }
    }

    public void updateGame(Game game, Score score) {
        if(games.contains(game)){
            game.setScore(score);
        }
    }

    public List<Game> getSummary() {
        return games.stream().sorted(Comparator.comparing(
                Game::getTotalScore).reversed()).collect(Collectors.toList());
    }

}
