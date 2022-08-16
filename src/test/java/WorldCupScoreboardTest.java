import model.Game;
import model.Score;
import model.Scoreboard;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorldCupScoreboardTest {

    @Test
    public void testSameScoreEquals(){
        Score score = new Score(0,0);
        Score score1 = new Score(0,0);
        Score score2 = new Score(2,0);
        Score score3 = new Score(0,2);
        assertEquals(score,score1);
        assertNotEquals(score2,score3);
    }

    @Test
    public void testGameStart(){
        Scoreboard scoreboard = new Scoreboard();
        Game game = new Game("FC Barcelona","Real Madrid");
        scoreboard.startGame(game);
        assertEquals(new Score(0,0),scoreboard.getScore(game));
    }
}
