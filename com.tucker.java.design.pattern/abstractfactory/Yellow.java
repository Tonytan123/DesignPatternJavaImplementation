package abstractfactory;

/**
 * @author tonyc
 */
public class Yellow implements Color{
    @Override
    public void fill() {
        System.out.println("Filling the shape with yellow color.");
    }
}
