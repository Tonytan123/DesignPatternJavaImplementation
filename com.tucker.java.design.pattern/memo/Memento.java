package memo;

/**
 * @author tonyc
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getStatus() {
        return state;
    }
}
