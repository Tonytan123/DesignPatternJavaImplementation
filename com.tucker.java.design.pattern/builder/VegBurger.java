package builder;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author tonyc
 */
public class VegBurger extends AbstractBurger{
    private String name = "VegBurger";

    private double price = 3.5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
}
