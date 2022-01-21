package state;

/**
 * @author tonyc
 */
public class LunchBreak implements State{
    public static final double LUNCH_BREAK_START_TIME = 12;

    @Override
    public void changeStateOrNot(Context context) {
        if(context.time >= LUNCH_BREAK_START_TIME &&
                context.time < AfternoonWork.AFTERNOON_WORK_START_TME) {
            System.out.println("now this time is before afternoon work start time, " +
                    "maybe you have started having lunch.");
        } else {
            context.setCurrentState(new AfternoonWork());
            context.printCurrentThing();
        }
    }
}
