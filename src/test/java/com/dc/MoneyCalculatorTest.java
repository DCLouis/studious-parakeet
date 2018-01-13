package com.dc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyCalculatorTest {
    private MoneyCalculator moneyCalculator;

    @Before
    public void setUp() throws Exception {
        moneyCalculator = new MoneyCalculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculator() {
        assertEquals(1, moneyCalculator.calculate());
    }

}