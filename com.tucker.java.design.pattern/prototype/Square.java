package prototype;

/**
 * @author tonyc
 */
public class Square extends Shape{

    public Square() {
        this.type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("we draw a square");
    }
}
