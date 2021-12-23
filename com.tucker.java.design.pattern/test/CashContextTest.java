package test;

import org.junit.Before;
import org.junit.Test;
import strategy.CashContext;
import strategy.CashDiscount;
import strategy.CashNormal;
import strategy.CashRebate;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyc
 */
public class CashContextTest {
    public CashContext cashContext;

    @Before
    public void setUp() {
        cashContext = new CashContext();
    }

    @Test
    public void testCashNormal() {
        CashNormal cashNormal = new CashNormal();
        cashContext.setStrategy(cashNormal);
        assertEquals(1.0, cashContext.getResult(1.0), 0.01);
    }

    @Test
    public void testCashDiscount() {
        CashDiscount cashDiscount = new CashDiscount();
        cashContext.setStrategy(cashDiscount);
        assertEquals(0.7, cashContext.getResult(1.0), 0.01);
    }

    @Test
    public void testCashRebate() {
        CashRebate cashRebate = new CashRebate();
        cashContext.setStrategy(cashRebate);
        assertEquals(410, cashContext.getResult(610.0), 0.01);
    }
}