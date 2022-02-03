package responsibilitychain;

/**
 * @author tonyc
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        super(level);
    }
    @Override
    protected void write(String message) {
        System.out.println("Error : " + message);
    }
}
