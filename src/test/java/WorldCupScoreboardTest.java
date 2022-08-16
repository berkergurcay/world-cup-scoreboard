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
}
