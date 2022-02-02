package singleton;

/**
 * @author tonyc
 */
public class Singleton {
    public static Singleton instance = null;

    private Singleton() {
        System.out.println("init the singleton");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
