package test;

import factorymethodpattern.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tonyc
 */
public class OperationFactoryTest {

    @Test
    public void testAddAlg() {
        AddFactory operationFactory = new AddFactory();
        Operation addOperation = operationFactory.generatorOperation();
        double result = addOperation.operation(1.0, 2.0);
        assertEquals(result, 3.0, 0.01);
    }

    @Test
    public void testMinusAlg() {
        MinusFactory operationFactory = new MinusFactory();
        Operation minusOperation = operationFactory.generatorOperation();
        double result = minusOperation.operation(2.0, 1.0);
        assertEquals(result, 1.0, 0.01);
    }

    @Test
    public void testMultiAlg() {
        MultiFactory operationFactory = new MultiFactory();
        Operation multiOperation = operationFactory.generatorOperation();
        double result = multiOperation.operation(2.0, 2);
        assertEquals(result, 4.0, 0.01);
    }
}