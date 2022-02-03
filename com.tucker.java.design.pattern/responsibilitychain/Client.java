package responsibilitychain;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        AbstractLogger abstractLoggerInfo = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger abstractLoggerDebug = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger abstractLoggerError = new ErrorLogger(AbstractLogger.ERROR);
        abstractLoggerDebug.setLogger(abstractLoggerInfo);
        abstractLoggerInfo.setLogger(abstractLoggerError);
        abstractLoggerDebug.writeMessage(3, "this is a test");
    }
}
