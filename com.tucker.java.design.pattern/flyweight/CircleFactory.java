package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class CircleFactory {
    public static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String name) {
        Shape shape = circleMap.get(name);
        if (shape == null) {
            Circle circle = new Circle(name);
            circleMap.put(name, circle);
            return circle;
        }
        return shape;
    }
}
