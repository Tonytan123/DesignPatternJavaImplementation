package strategy;

/**
 * @author tonyc
 */
public class CashContext {
    public Strategy strategy;

    public void setStrategy(Strategy strategyOuter){
        this.strategy = strategyOuter;
    }

    public double getResult(double money){
        return this.strategy.acceptCash(money);
    }
}
