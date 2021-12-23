package strategy;

/**
 * @author tonyc
 */
public class CashRebate implements Strategy{
    public static final double THRESHOLD = 300.0;
    public static final double DISCOUNT = 100.0;
    public double acceptCash(double money) {
        if(money > THRESHOLD) {
            int number = (int)(money / THRESHOLD);
            money = money - number * DISCOUNT;
        }
        return money;
    }
}
