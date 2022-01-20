package abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tonyc
 */
public class ColorFactory extends AbstractFactory{
    public static Map<String, Color> colorMap = new HashMap<>();
    public static void init() {
        colorMap.put("blue", new Blue());
        colorMap.put("red", new Red());
        colorMap.put("yellow", new Yellow());
    }
    @Override
    public Shape createShape(String name) {
        return null;
    }

    @Override
    public Color createColor(String name) {
        init();
        return colorMap.get(name);
    }
}
