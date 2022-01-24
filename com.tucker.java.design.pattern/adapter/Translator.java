package adapter;

/**
 * @author tonyc
 */
public class Translator implements People{
    private final 中国人 chinese = new 中国人();
    @Override
    public void eat() {
        chinese.吃饭();
    }

    @Override
    public void sleep() {
        chinese.睡觉();
    }

    @Override
    public void run() {
        chinese.跑步();
    }
}
