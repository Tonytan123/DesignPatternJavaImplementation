package state;

/**
 * @author tonyc
 */
public class MorningWork implements State{
    @Override
    public void changeStateOrNot(Context context) {
        if(context.time >= BreakFast.MORNING_WORK_START_TIME &&
                context.time < LunchBreak.LUNCH_BREAK_START_TIME
        ) {
            System.out.println("now this time is before lunch break time, " +
                    "maybe you have started working in the morning.");
        } else {
            context.setCurrentState(new LunchBreak());
            context.printCurrentThing();
        }
    }

}
