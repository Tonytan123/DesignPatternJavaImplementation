package expression;

/**
 * @author tonyc
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String name) {
        return name.contains(data);
    }
}
