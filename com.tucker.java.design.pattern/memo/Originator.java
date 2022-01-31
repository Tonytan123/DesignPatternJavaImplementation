package memo;

/**
 * @author tonyc
 */
public class Originator {
    public String state;

    public void initStatus() {
        this.state = "InitStatus";
        System.out.println("Current state is " + state);
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void changeStatus() {
        state = "finished";
        System.out.println("current state is " + state);
    }

    public void resetStatus(Memento memento) {
        this.state = memento.getStatus();
        System.out.println("Current state is " + state);
    }
}
