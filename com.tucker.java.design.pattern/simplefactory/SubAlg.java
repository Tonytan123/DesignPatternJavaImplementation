package simplefactory;

/**
 * @author tonyc
 */
public class SubAlg extends CalculatorAlg{
    @Override
    public Double calculateResult() {
        return numberA - numberB;
    }
}
