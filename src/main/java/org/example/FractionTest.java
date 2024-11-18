package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testFractionCreation() throws NullDenominatorException {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test(expected = NullDenominatorException.class)
    public void testFractionCreationWithZeroDenominator() throws NullDenominatorException {
        new Fraction(1, 0);
    }

    @Test
    public void testFractionToString() throws NullDenominatorException {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("3/4", fraction.toString());
    }
}
