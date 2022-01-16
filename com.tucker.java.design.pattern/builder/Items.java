package builder;

/**
 * @author tonyc
 */
public interface Items {
    /**
     *
     * pack
     * @return Packing
     */
    public Packing pack();
    /**
     *
     * getName
     * @return String
     */
    public String getName();
    /**
     *
     * getPrice
     * @return double
     */
    public double getPrice();
}
