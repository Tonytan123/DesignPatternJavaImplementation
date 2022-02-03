package visitor;

/**
 * @author tonyc
 */
public interface Action {
    /**
     * writeMenAction
     *
     * @param visitor
     */
    void writeMenAction(Person visitor);
    /**
     * writeWomenAction
     *
     * @param visitor
     */
    void writeWomenAction(Person visitor);
}
