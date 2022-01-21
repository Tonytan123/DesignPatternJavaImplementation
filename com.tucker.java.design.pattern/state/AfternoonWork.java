package state;

/**
 * @author tonyc
 */
public class AfternoonWork implements State{
    public static final double AFTERNOON_WORK_START_TME = 14;
    @Override
    public void changeStateOrNot(Context context) {
        if (context.time >= AFTERNOON_WORK_START_TME &&
                context.time < OffWork.OFF_WORK_TIME) {
            System.out.println("now this time is before off work time, " +
                    "maybe you have started having afternoon work.");
        } else {
            context.setCurrentState(new OffWork());
            context.printCurrentThing();
        }
    }
}
