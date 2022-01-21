package state;

/**
 * @author tonyc
 */
public class Context {
    public double time;

    private State currentState = new BreakFast();

    public void printCurrentThing() {
        currentState.changeStateOrNot(this);
    }

    void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
