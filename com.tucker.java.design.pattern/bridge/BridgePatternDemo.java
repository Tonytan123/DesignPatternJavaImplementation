package bridge;

/**
 * @author tonyc
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        AbstractShape abstractShapeRed = new Circle(1, 1, 2, new RedDrawApi());
        AbstractShape abstractShapeYellow = new Circle(2,2,4, new YellowDrawApi());
        abstractShapeRed.drawShape();
        abstractShapeYellow.drawShape();
    }
}
