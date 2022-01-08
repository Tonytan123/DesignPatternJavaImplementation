package test;

import org.junit.Before;
import org.junit.Test;
import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;
import prototype.ShapeCache;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyc
 */
public class PrototypeTest {
    @Test
    public void testDrawRectangle() {
        ShapeCache.init();
        Shape rectangle = ShapeCache.getShape("1");
        rectangle.draw();
    }
    @Test
    public void testDrawCircle() {
        ShapeCache.init();
        Shape circle = ShapeCache.getShape("2");
        circle.draw();
    }
    @Test
    public void testDrawSquare() {
        ShapeCache.init();
        Shape square = ShapeCache.getShape("3");
        square.draw();
    }

}
