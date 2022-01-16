package builder;

/**
 * @author tonyc
 */
public abstract class AbstractDrink implements Items{
    public Packing pack() {
        return new Bottle();
    }
    /**
     *
     * getName
     * @return String
     */
    public abstract String getName() ;
    /**
     *
     * getPrice
     * @return double
     */
    public abstract double getPrice() ;
}
