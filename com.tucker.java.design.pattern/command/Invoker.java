package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tonyc
 */
public class Invoker {
    private List<Command> orders = new ArrayList<>();

    public void setCommand(Command command) {
        orders.add(command);
    }

    public void executeCommand() {
        for(Command command : orders) {
            command.execute();
        }
    }
}
