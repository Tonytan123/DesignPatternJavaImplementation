package simplefactory;

/**
 * @author tucker
 */
public class AddAlg extends CalculatorAlg{
    @Override
    public Double calculateResult() {
        return numberA + numberB;
    }
}
