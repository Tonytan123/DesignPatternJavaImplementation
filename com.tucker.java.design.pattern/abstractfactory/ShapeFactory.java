package abstractfactory;

import javafx.fxml.Initializable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class ShapeFactory extends AbstractFactory{
    public static Map<String, Shape> shapeMap = new HashMap<>();
    public static void init() {
        shapeMap.put("rectangle", new Rectangle());
        shapeMap.put("circle", new Circle());
        shapeMap.put("square", new Square());
    }
    @Override
    public Shape createShape(String name) {
        init();
        return shapeMap.get(name);
    }

    @Override
    public Color createColor(String name) {
        return null;
    }
}
