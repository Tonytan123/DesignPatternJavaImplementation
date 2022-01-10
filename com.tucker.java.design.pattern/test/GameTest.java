package test;

import org.junit.Test;
import templatepattern.FootBall;
import templatepattern.Game;
import templatepattern.PingPongBall;

/**
 * @author tonyc
 */
public class GameTest {
    @Test
    public void testPingPongBall(){
        Game game = new PingPongBall();
        game.play();
    }

    @Test
    public void testFootBall() {
        Game game = new FootBall();
        game.play();
    }
}
