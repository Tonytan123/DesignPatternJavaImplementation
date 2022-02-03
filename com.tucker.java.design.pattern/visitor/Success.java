package visitor;

/**
 * @author tonyc
 */
public class Success implements Action{
    private String name = "success";

    @Override
    public void writeMenAction(Person visitor) {
        System.out.println("if a men "+ name + ", he must be have a successful "+ visitor.getClass().getName());
    }

    @Override
    public void writeWomenAction(Person visitor) {
        System.out.println("if a women "+ name + ", she must be have a unsuccessful "+ visitor.getClass().getName());
    }
}
