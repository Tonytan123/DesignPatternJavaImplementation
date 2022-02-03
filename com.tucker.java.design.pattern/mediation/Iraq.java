package mediation;

/**
 * @author tonyc
 */
public class Iraq extends AbstractCountry{
    public Iraq(Union union) {
        super(union);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Iraq send the message : " + message);
        union.sendMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Iraq get the message : " + message);
    }
}
