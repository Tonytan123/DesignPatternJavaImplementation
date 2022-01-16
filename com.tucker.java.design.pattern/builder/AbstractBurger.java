package builder;

/**
 * @author tonyc
 */
public abstract  class AbstractBurger implements Items{
    public Packing pack() {
        return new Wrapper();
    }
    /**
     *
     * getName
     * @return String
     */
    public abstract String getName();
    /**
     *
     * getPrice
     * @return double
     */
    public abstract double getPrice();

}
