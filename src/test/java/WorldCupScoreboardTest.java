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
}
