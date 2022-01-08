package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class ShapeCache {

    public static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void init() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);
        Circle circle = new Circle();
        circle.setId("2");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
