package responsibilitychain;

/**
 * @author tonyc
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        super(level);
    }
    @Override
    protected void write(String message) {
        System.out.println("Info : " + message);
    }
}
