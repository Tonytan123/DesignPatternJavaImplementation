package mediation;

/**
 * @author tonyc
 */
public class Usa extends AbstractCountry{
    public Usa(Union union) {
        super(union);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Usa send the message : " + message);
        union.sendMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Usa get the message : " + message);
    }
}
