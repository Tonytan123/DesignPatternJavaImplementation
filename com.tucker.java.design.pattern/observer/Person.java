package observer;

/**
 * @author tonyc
 */
public interface Person {
    /**
     *
     * stopDoSomething
     * @param observer
     */
    public void stopDoSomething(Observer observer);

    /**
     *
     * getName
     * @return String
     */
    public String getName();

}
