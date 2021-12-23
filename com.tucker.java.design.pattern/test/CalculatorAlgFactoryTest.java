package test;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import simplefactory.CalculatorAlg;
import simplefactory.CalculatorAlgFactory;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyc
 */
public class CalculatorAlgFactoryTest {
    public CalculatorAlgFactory calculatorAlgFactory;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        calculatorAlgFactory = new CalculatorAlgFactory();
    }

    @Test
    public void testAddAlg() throws Exception {
        CalculatorAlg alg = calculatorAlgFactory.createCalculatorAlg('+');
        alg.numberA = 1.0;
        alg.numberB = 2.0;
        double result = alg.calculateResult();
        assertEquals(result, 3.0, 0.01);
    }

    @Test
    public void testDivisionAlg() throws Exception {
        CalculatorAlg alg = calculatorAlgFactory.createCalculatorAlg('/');
        alg.numberA = 2.0;
        alg.numberB = 1.0;
        double result = alg.calculateResult();
        assertEquals(result, 2.0, 0.01);
    }

    @Test
    public void testMultiplyAlg() throws Exception {
        CalculatorAlg alg = calculatorAlgFactory.createCalculatorAlg('*');
        alg.numberA = 2.0;
        alg.numberB = 1.0;
        double result = alg.calculateResult();
        assertEquals(result, 2.0, 0.01);
    }

    @Test
    public void testSubAlg() throws Exception {
        CalculatorAlg alg = calculatorAlgFactory.createCalculatorAlg('-');
        alg.numberA = 2.0;
        alg.numberB = 1.0;
        double result = alg.calculateResult();
        assertEquals(result, 1.0, 0.01);
    }

    @Test
    public void testExceptedAlg() throws Exception {
        thrown.expectMessage("unsupported operator!");
        CalculatorAlg alg = calculatorAlgFactory.createCalculatorAlg('^');
        alg.numberA = 2.0;
        alg.numberB = 1.0;
        alg.calculateResult();
    }
}