import model.Game;
import model.Score;
import model.Scoreboard;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void testGameFinish(){
        Scoreboard scoreboard = new Scoreboard();
        Game game = new Game("FC Barcelona","Real Madrid");
        scoreboard.startGame(game);
        scoreboard.finishGame(game);
        assertFalse(scoreboard.getGames().contains(game));
    }

    @Test
    public void testUpdateScore(){
        Scoreboard scoreboard = new Scoreboard();
        Game game = new Game("FC Barcelona","Real Madrid");
        scoreboard.startGame(game);
        scoreboard.updateGame(game,new Score(3,2));
        assertEquals(new Score(3,2),scoreboard.getScore(game));
    }

    @Test
    public void testUpdateFinishedGameScore(){
        Scoreboard scoreboard = new Scoreboard();
        Game game = new Game("FC Barcelona","Real Madrid");
        scoreboard.startGame(game);
        scoreboard.finishGame(game);
        scoreboard.updateGame(game,new Score(3,2));
        assertEquals(new Score(0,0),scoreboard.getScore(game));
    }

    @Test
    public void testGetSummaryByTotalScore(){
        Scoreboard scoreboard = new Scoreboard();
        Game mexicoCanada = new Game("Mexico","Canada");
        Game spainBrazil = new Game("Spain","Brazil");
        Game germanyFrance = new Game("Germany","France");
        Game uruguayItaly = new Game("Uruguay","Italy");
        Game argentinaAustralia = new Game("Argentina","Australia");
        scoreboard.startGame(mexicoCanada);
        scoreboard.updateGame(mexicoCanada,new Score(0,5));
        scoreboard.startGame(spainBrazil);
        scoreboard.updateGame(spainBrazil,new Score(10,2));
        scoreboard.startGame(germanyFrance);
        scoreboard.updateGame(germanyFrance,new Score(2,2));
        scoreboard.startGame(uruguayItaly);
        scoreboard.updateGame(uruguayItaly,new Score(6,6));
        scoreboard.startGame(argentinaAustralia);
        scoreboard.updateGame(argentinaAustralia,new Score(3,1));
        // assertEquals(Arrays.asList(uruguayItaly,spainBrazil,mexicoCanada,argentinaAustralia,germanyFrance),scoreboard.getSummary());
        assertEquals(Arrays.asList(spainBrazil,uruguayItaly,mexicoCanada,germanyFrance,argentinaAustralia),scoreboard.getSummary());
    }
}
