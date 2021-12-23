package strategy;

/**
 * @author tonyc
 */
public class CashDiscount implements Strategy{
    public static final double DISCOUNT_RATE = 0.7;
    public double acceptCash(double money) {
        money = money * DISCOUNT_RATE;
        return money;
    }
}
