package composite;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class FinanceDepartment implements Company{
    public String name;

    public FinanceDepartment(String name) {
        this.name = name;
    }
    @Override
    public void add(String name, Company company) {
    }

    @Override
    public void remove(String name) {
    }

    @Override
    public void showDuties(int depth) {
        String prefix = String.join("", Collections.nCopies(depth, "-"));
        System.out.println(prefix + name);
    }
}
