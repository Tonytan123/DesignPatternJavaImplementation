package abstractfactory;

/**
 * @author tonyc
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("we draw a rectangle.");
    }
}
