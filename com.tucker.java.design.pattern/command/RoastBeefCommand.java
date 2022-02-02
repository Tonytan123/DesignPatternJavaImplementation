package command;

/**
 * @author tonyc
 */
public class RoastBeefCommand implements Command{
    private Receiver receiver;

    public RoastBeefCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.RoastBeef();
    }
}
