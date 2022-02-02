package command;

/**
 * @author tonyc
 */
public class RoastLambCommand implements Command{
    private Receiver receiver;

    public RoastLambCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.RoastLamb();
    }
}
