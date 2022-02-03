package mediation;

/**
 * @author tonyc
 */
public interface Union {
    /**
     *
     * sendMessage
     *
     * @param message String
     * @param country AbstractCountry
     *
     */
    public void sendMessage(AbstractCountry country, String message);
}
