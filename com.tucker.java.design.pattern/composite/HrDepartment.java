package composite;

import java.util.Collection;
import java.util.Collections;

/**
 * @author tonyc
 */
public class HrDepartment implements Company{
    public String name;

    public HrDepartment(String name) {
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
