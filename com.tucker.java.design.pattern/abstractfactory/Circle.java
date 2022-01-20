package abstractfactory;

/**
 * @author tonyc
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("we draw a circle.");
    }
}
