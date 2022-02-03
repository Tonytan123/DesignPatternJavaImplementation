package visitor;

/**
 * @author tonyc
 */
public class Women implements Person{
    @Override
    public void accept(Action action) {
        action.writeWomenAction(this);
    }
}
