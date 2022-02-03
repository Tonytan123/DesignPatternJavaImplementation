package visitor;

/**
 * @author tonyc
 */
public interface Person {
    /**
     * accept
     *
     * @param action Action
     */
    void accept(Action action);
}
