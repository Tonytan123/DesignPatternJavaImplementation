package abstractfactory;

/**
 * @author tonyc
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Filling the shape with the blue color.");
    }
}
