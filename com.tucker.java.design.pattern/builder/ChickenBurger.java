package builder;

/**
 * @author tonyc
 */
public class ChickenBurger extends AbstractBurger{
    private String name = "chicken";

    private double price = 2;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
