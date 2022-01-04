package factorymethodpattern;

/**
 * @author tonyc
 */
public class MinusFactory implements OperationFactory{
    public Operation generatorOperation() {
        return new MinusOperation();
    }
}
