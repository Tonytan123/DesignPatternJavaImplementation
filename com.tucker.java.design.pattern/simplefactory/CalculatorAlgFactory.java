package simplefactory;

/**
 * @author tonyc
 */
public class CalculatorAlgFactory {
    public CalculatorAlg createCalculatorAlg(char cha) throws Exception {
        switch(cha) {
            case '+':
            {
                return new AddAlg();
            }
            case '-' :
            {
                return new SubAlg();
            }
            case '*' :
            {
                return new MultiplyAlg();
            }
            case '/' :
            {
                return new DivisionAlg();
            }
            default:
                throw new Exception("unsupported operator!");

        }
    }
}
