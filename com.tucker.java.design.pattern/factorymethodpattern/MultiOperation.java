package factorymethodpattern;

/**
 * @author tonyc
 */
public class MultiOperation implements Operation{
    @Override
    public double operation(double a, double b) {
        return a * b;
    }
}
