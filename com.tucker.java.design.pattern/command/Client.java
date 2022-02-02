package command;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiverBob = new Receiver("Bob");
        Receiver receiverAlice = new Receiver("Alice");
        RoastLambCommand commandOne = new RoastLambCommand(receiverAlice);
        invoker.setCommand(commandOne);
        RoastLambCommand commandTwo = new RoastLambCommand(receiverBob);
        invoker.setCommand(commandTwo);
        RoastBeefCommand commandThree = new RoastBeefCommand(receiverAlice);
        invoker.setCommand(commandThree);
        RoastBeefCommand commandFour = new RoastBeefCommand(receiverBob);
        invoker.setCommand(commandFour);

        invoker.executeCommand();
    }
}
