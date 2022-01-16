package builder;

/**
 * @author tonyc
 */
public class Pepsi extends AbstractDrink{
    private String name = "pepsi";

    private double price = 1.5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
