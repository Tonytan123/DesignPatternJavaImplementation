package templatepattern;

/**
 * @author tonyc
 */
public class PingPongBall extends Game{
    @Override
    public void init() {
        System.out.println("we prepare to play the game of ping-pong ball");
    }

    @Override
    public void startPlay() {
        System.out.println("we start to play the game of ping-pong ball");
    }

    @Override
    public void endPlay() {
        System.out.println("we finish to play the game of ping-pong ball");
    }
}
