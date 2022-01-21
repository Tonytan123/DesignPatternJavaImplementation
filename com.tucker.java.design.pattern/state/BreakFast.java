package state;

/**
 * @author tonyc
 */
public class BreakFast implements State{
    public static final double MORNING_WORK_START_TIME = 9;
    @Override
    public void changeStateOrNot(Context context) {
        if (context.time < MORNING_WORK_START_TIME){
            System.out.println("now this time is before morning work, maybe you have started having breakfast.");
        } else {
            context.setCurrentState(new MorningWork());
            context.printCurrentThing();
        }
    }
}
