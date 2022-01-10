package templatepattern;

/**
 * @author tonyc
 */
public class FootBall extends Game{
    @Override
    public void init() {
        System.out.println("we prepare to play the game of football");
    }

    @Override
    public void startPlay() {
        System.out.println("we start to play the game of football");
    }

    @Override
    public void endPlay() {
        System.out.println("we finish to play the game of football");
    }
}
