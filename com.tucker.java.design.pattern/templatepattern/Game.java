package templatepattern;

public abstract class Game {
    /**
     * init
     *
     */
    public abstract void init() ;
    /**
     * startPlay
     *
     */
    public abstract void startPlay();
    /**
     * endPlay
     *
     */
    public abstract void endPlay();

    public final void play() {
        init();
        startPlay();
        endPlay();
    }

}
