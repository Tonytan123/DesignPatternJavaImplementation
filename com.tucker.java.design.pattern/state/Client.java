package state;

import proxy.Proxy;

/**
 * @author tonyc
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.time = 6;
        context.printCurrentThing();
        context.time = 10;
        context.printCurrentThing();
        context.time = 13;
        context.printCurrentThing();
        context.time = 15;
        context.printCurrentThing();
        context.time = 19;
        context.printCurrentThing();
    }
}
