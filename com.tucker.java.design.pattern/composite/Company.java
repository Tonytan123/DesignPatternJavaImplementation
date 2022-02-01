package composite;

/**
 * @author tonyc
 */
public interface Company {
    /**
     *
     * add
     * @param name String
     * @param company Company
     */
    void add(String name, Company company);

    /**
     *
     * add
     * @param name String
     */
    void remove(String name);

    /**
     *
     * showDuties
     * @param depth int
     */
    void showDuties(int depth);
}
