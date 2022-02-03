package responsibilitychain;


/**
 * @author tonyc
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int type;

    private AbstractLogger logger;

    public AbstractLogger(int level) {
        this.type = level;
    }
    protected void setLogger(AbstractLogger logger) {
        this.logger = logger;
    }

    public void writeMessage(int level, String message) {
        if (level >= type) {
            write(message);
        }
        if(logger != null) {
            logger.writeMessage(level, message);
        }
    }

    /**
     *
     * write
     * @param message String
     */
    protected abstract void write(String message);
}
