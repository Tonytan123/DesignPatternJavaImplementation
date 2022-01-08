package prototype;

/**
 * @author tonyc
 */
public class Circle extends Shape{

    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("we draw a circle");
    }
}
