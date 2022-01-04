package factorymethodpattern;

/**
 * @author tonyc
 */
public class AddFactory implements OperationFactory{
    public Operation generatorOperation() {
        return new AddOperation();
    }
}
