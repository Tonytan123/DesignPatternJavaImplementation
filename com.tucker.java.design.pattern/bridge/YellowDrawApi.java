package bridge;

/**
 * @author tonyc
 */
public class YellowDrawApi implements DrawApi{
    @Override
    public void drawColor(int x, int y, int radius) {
        System.out.println("we draw a yellow circle , the circle's x pos = " + x +
                ", the circle's y pos = "+ y +", the circle's radius = "+ radius);
    }
}
