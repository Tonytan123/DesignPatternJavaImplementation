package command;

/**
 * @author tonyc
 */
public class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }
    public void RoastLamb() {
        System.out.println("Cook "+ name + " start to roast lamb.");
    }

    public void RoastBeef() {
        System.out.println("Cook "+ name + " start to roast beef.");
    }
}
