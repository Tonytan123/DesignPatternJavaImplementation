package memo;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.initStatus();
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento("init", originator.createMemento());
        originator.changeStatus();
        originator.resetStatus(careTaker.getMemento("init"));
    }
}
