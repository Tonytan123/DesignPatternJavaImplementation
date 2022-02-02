package bridge;

/**
 * @author tonyc
 */
public abstract class AbstractShape {
    protected DrawApi drawApi;

    public AbstractShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     *
     * drawShape
     */
    public abstract void drawShape();
}
