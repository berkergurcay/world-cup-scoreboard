import model.Game;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class WorldCupScoreboardTest {

    @Test
    public void testGameInitalScore(){
        Game game = new Game();
        assertEquals(0, game.getHomeScore());
        assertEquals(0,game.getAwayScore());
    }

    @Test
    public void testUpdateScore(){
        Game game = new Game();
        game.setHomeScore(1);
        game.setAwayScore(5);
        assertEquals(1,game.getHomeScore());
        assertEquals(5,game.getAwayScore());
    }

    @Test
    public void testGameLive(){
        Game game = new Game();
        assertEquals(true,game.isLive());
    }

    @Test
    public void testGamesEqual(){
        Game game1 = new Game();
        game1.setHomeTeam("FC Barcelona");
        game1.setAwayTeam("Real Madrid");
        game1.setStartDate(LocalDateTime.of(2022,8,16,20,0,0));

        Game game2 = new Game();
        game2.setHomeTeam("FC Barcelona");
        game2.setAwayTeam("Real Madrid");
        game2.setStartDate(LocalDateTime.of(2022,8,16,20,0,0));


        Game game3 = new Game();
        game3.setHomeTeam("Real Madrid");
        game3.setAwayTeam("FC Barcelona");
        game3.setStartDate(LocalDateTime.of(2022,8,16,20,0,0));

        Game game4 = new Game();
        game4.setHomeTeam("Real Madrid");
        game4.setAwayTeam("FC Barcelona");
        game4.setStartDate(LocalDateTime.of(2021,8,16,20,0,0));

        assertEquals(game1,game2);
        assertNotEquals(game1,game3);
        assertNotEquals(game1,game4);
    }
}
