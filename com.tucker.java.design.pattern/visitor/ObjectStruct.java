package visitor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class ObjectStruct {
    private Map<String, Person> personMap = new HashMap<>();

    public void addPerson(String name, Person visitor) {
        personMap.put(name, visitor);
    }

    public void deletePerson(String name) {
        personMap.remove(name);
    }

    public void notifyAllPerson(Action action) {
        for(Person key : personMap.values()) {
            key.accept(action);
        }
    }
}
