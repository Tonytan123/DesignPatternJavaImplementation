package abstractfactory;

/**
 * @author tonyc
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("we draw a square.");
    }
}
