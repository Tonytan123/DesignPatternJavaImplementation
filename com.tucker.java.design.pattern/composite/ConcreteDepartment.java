package composite;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class ConcreteDepartment implements Company{
    private String name;

    public Map<String, Company> children = new HashMap<>();

    public ConcreteDepartment(String name) {
        this.name = name;
    }

    @Override
    public void add(String name, Company company) {
        children.put(name, company);
    }

    @Override
    public void remove(String name) {
        children.remove(name);
    }

    @Override
    public void showDuties(int depth) {
        String prefix = String.join("", Collections.nCopies(depth, "-"));
        System.out.println(prefix + name);
        for( Company  value : children.values()) {
            value.showDuties(depth + 2);
        }
    }
}
