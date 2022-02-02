package bridge;

/**
 * @author tonyc
 */
public class Circle extends AbstractShape{
    private int x;
    private int y;
    private int radius;
    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        drawApi.drawColor(this.x, this.y, this.radius);
    }
}
