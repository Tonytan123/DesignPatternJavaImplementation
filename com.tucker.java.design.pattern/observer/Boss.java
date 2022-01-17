package observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class Boss implements Observer{
    public String name = "Boss";

    public Map<String, Person> personMap = new HashMap<>();
    @Override
    public void addPerson(String name, Person person) {
        personMap.put(name, person);
    }

    @Override
    public void delPerson(String name) {
        personMap.remove(name);
    }

    @Override
    public void notifyAllPerson() {
        for (Person person : personMap.values()) {
            person.stopDoSomething(this);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
