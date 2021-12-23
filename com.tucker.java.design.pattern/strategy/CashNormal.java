package strategy;

/**
 * @author tonyc
 */
public class CashNormal implements Strategy{
    public double acceptCash(double money) {
        return money;
    }
}
