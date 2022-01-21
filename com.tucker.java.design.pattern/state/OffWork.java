package state;

/**
 * @author tonyc
 */
public class OffWork implements State{
    public static final double OFF_WORK_TIME = 18;
    @Override
    public void changeStateOrNot(Context context) {
        if(context.time >= OFF_WORK_TIME) {
            System.out.println("now you just off the work.");
        } else {
            context.setCurrentState(new BreakFast());
            context.printCurrentThing();
        };
    }
}
