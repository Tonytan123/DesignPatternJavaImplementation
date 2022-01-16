package builder;

/**
 * @author tonyc
 */
public class CokeCola extends AbstractDrink{
    private String name = "CokeCola";

    private double price = 1;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
