package composite;


/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        Company root = new ConcreteDepartment("Beijing head office");
        root.add("BeijingHrDepartment", new HrDepartment("BeijingHrDepartment"));
        root.add("BeijingFinanceDepartment", new FinanceDepartment("BeijingFinanceDepartment"));

        ConcreteDepartment comp = new ConcreteDepartment("Shanghai East China Branch");
        comp.add("East China Branch HrDepartment", new HrDepartment("East China Branch HrDepartment"));
        comp.add("East China Branch FinanceDepartment",new FinanceDepartment("East China Branch FinanceDepartment"));
        root.add("Shanghai East China Branch", comp);
        root.showDuties(1);
    }
}
