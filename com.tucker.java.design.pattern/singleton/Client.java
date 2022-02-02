package singleton;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if(singleton == singleton1) {
            System.out.println("singleton and singleton1 is the same Singleton");
        }
    }
}
