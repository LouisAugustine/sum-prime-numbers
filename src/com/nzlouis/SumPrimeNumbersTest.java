package com.nzlouis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SumPrimeNumbersTest {

    @Test
    public void testPrimeNumbersSumShouldReturnCorrectSum() {
        assertEquals(0l, (long) SumPrimeNumbers.getPrimeNumbersSum(-2));
        assertEquals(0l, (long) SumPrimeNumbers.getPrimeNumbersSum(0));
        assertEquals(0l, (long) SumPrimeNumbers.getPrimeNumbersSum(1));
        assertEquals(2l, (long) SumPrimeNumbers.getPrimeNumbersSum(2));
        assertEquals(5l, (long) SumPrimeNumbers.getPrimeNumbersSum(3));
        assertEquals(10l, (long) SumPrimeNumbers.getPrimeNumbersSum(5));
        assertEquals(17l, (long) SumPrimeNumbers.getPrimeNumbersSum(10));
    }

    @Test
    public void testPrimeNumbersShouldReturnCorrectLengthOfNumbers() {
        assertEquals(0, SumPrimeNumbers.getPrimeNumbers(0).size());
        assertEquals(0, SumPrimeNumbers.getPrimeNumbers(1).size());
        assertEquals(1, SumPrimeNumbers.getPrimeNumbers(2).size());
        assertEquals(2, SumPrimeNumbers.getPrimeNumbers(3).size());
        assertEquals(3, SumPrimeNumbers.getPrimeNumbers(5).size());
        assertEquals(4, SumPrimeNumbers.getPrimeNumbers(7).size());
        assertEquals(4, SumPrimeNumbers.getPrimeNumbers(10).size());
    }

    @Test
    public void testPrimeNumbersShouldReturnCorrectNumbers() {
        assertEquals(2l, (long) SumPrimeNumbers.getPrimeNumbers(2).get(0));
        assertEquals(2l, (long) SumPrimeNumbers.getPrimeNumbers(3).get(0));
        assertEquals(3l, (long) SumPrimeNumbers.getPrimeNumbers(3).get(1));
        assertEquals(5l, (long) SumPrimeNumbers.getPrimeNumbers(5).get(2));
        assertEquals(7l, (long) SumPrimeNumbers.getPrimeNumbers(7).get(3));
        assertEquals(11l, (long) SumPrimeNumbers.getPrimeNumbers(11).get(4));
    }

    @Test
    public void testPrimeNumbersShouldContainCorrectNumbers() {
        assertTrue(SumPrimeNumbers.getPrimeNumbers(3).contains(3));
        assertTrue(SumPrimeNumbers.getPrimeNumbers(7).contains(3));
        assertTrue(SumPrimeNumbers.getPrimeNumbers(7).contains(5));
        assertTrue(SumPrimeNumbers.getPrimeNumbers(100).contains(97));
        assertTrue(SumPrimeNumbers.getPrimeNumbers(200).contains(199));
        assertTrue(SumPrimeNumbers.getPrimeNumbers(1000).contains(997));
    }

    @Test(timeout = 200)
    public void testPrimeNumbersSumShouldReturnBeforeTimeout() {
        int primeNumbers = 10_000_000;
        SumPrimeNumbers.getPrimeNumbersSum(primeNumbers);
    }

    @Test(timeout = 400)
    public void testPrimeNumbersShouldReturnBeforeTimeout() {
        int primeNumbers = 10_000_000;
        SumPrimeNumbers.getPrimeNumbers(primeNumbers);
    }

}
