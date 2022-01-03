package proxy;

/**
 * @author tonyc
 */
public class RealSubject implements InterfaceProxy{
    public void request() {
        System.out.println("I am real RealSubject.");
    }
}
