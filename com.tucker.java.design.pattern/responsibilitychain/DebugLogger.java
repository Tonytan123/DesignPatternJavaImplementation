package responsibilitychain;

/**
 * @author tonyc
 */
public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level) {
        super(level);
    }
    @Override
    protected void write(String message) {
        System.out.println("Debug : "+ message);
    }
}
