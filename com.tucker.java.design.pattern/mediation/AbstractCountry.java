package mediation;

/**
 * @author tonyc
 */
public abstract class AbstractCountry {
    protected Union union;

    public AbstractCountry(Union union) {
        this.union = union;
    }

    /**
     *
     * sendMessage
     *
     * @param message String
     *
     */
    public abstract void sendMessage( String message) ;
    /**
     *
     * getMessage
     *
     * @param message String
     *
     */
    public abstract void getMessage(String message);
}
