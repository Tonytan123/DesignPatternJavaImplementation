package prototype;

/**
 * @author tonyc
 */
public class Rectangle extends Shape{
    public Rectangle() {
        this.type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("we draw a rectangle");
    }
}
