package abstractfactory;

/**
 * @author tonyc
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.produceFactory("SHAPE");
        Shape shape1 = shapeFactory.createShape("circle");
        shape1.draw();
        AbstractFactory colorFactory = FactoryProducer.produceFactory("COLOR");
        Color color1 = colorFactory.createColor("blue");
        color1.fill();

    }
}
