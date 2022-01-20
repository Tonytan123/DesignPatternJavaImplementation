package abstractfactory;

/**
 * @author tonyc
 */
public abstract class AbstractFactory {
    /**
     *
     * createShape
     * @param name
     * @return Shape
     */
    public abstract Shape createShape(String name);
    /**
     *
     * createColor
     * @param name
     * @return Color
     */
    public abstract Color createColor(String name);
}
