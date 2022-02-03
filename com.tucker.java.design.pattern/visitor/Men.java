package visitor;

/**
 * @author tonyc
 */
public class Men implements Person{
    @Override
    public void accept(Action action) {
        action.writeMenAction(this);
    }
}
