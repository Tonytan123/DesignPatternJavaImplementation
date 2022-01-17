package observer;

/**
 * @author tonyc
 */
public interface Observer {
    /**
     *
     * addPerson
     * @param name
     * @param person
     */
    public void addPerson(String name , Person person);
    /**
     *
     * delPerson
     * @param name
     */
    public void delPerson(String name);
    /**
     *
     * notifyAllPerson
     */
    public void notifyAllPerson();
    /**
     *
     * getName
     * @return String
     */
    public String getName();
}
