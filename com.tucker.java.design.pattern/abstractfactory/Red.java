package abstractfactory;

/**
 * @author tonyc
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Filling the shape with red color.");
    }
}
