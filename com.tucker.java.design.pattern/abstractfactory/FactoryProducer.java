package abstractfactory;

/**
 * @author tonyc
 */
public class FactoryProducer {
    public static AbstractFactory produceFactory(String name) {
        if(name.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if(name.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
