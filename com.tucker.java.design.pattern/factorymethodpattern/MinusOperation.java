package factorymethodpattern;

/**
 * @author tonyc
 */
public class MinusOperation implements Operation{
    @Override
    public double operation(double a, double b) {
        return a - b;
    }
}
