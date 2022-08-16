import model.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(true,game.live);
    }
}
