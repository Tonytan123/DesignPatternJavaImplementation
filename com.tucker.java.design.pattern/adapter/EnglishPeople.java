package adapter;

/**
 * @author tonyc
 */
public class EnglishPeople implements People{
    @Override
    public void eat() {
        System.out.println("A English man eat some food.");
    }

    @Override
    public void sleep() {
        System.out.println("A English man want to sleep.");
    }

    @Override
    public void run() {
        System.out.println("A English man start to run.");
    }
}
