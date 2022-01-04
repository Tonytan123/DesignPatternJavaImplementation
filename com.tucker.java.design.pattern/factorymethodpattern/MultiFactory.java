package factorymethodpattern;

/**
 * @author tonyc
 */
public class MultiFactory implements OperationFactory{
    public Operation generatorOperation() {
        return new MultiOperation();
    }
}
