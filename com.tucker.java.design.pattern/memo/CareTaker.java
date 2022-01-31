package memo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class CareTaker {
    private Map<String, Memento> mementoMap = new HashMap<>();

    public void addMemento(String name, Memento memento) {
        mementoMap.put(name, memento);
    }

    public Memento getMemento(String name) {
        return mementoMap.get(name);
    }
}
