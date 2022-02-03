package visitor;

/**
 * @author tonyc
 */
public class Failure implements Action{
    private String name = "fail";
    @Override
    public void writeMenAction(Person visitor) {
        System.out.println("if a men "+ name + ", he must be have a unsuccessful "+ visitor.getClass().getName());
    }

    @Override
    public void writeWomenAction(Person visitor) {
        System.out.println("if a women "+ name + ", she must be have a unsuccessful "+ visitor.getClass().getName());
    }
}
