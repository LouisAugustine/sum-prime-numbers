package com.nzlouis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit PrimeNumbers Test
 * @author Louis
 *
 */
public class PrimeNumbersTest {

    @Test
    public void testPrimeNumbersSumShouldReturnCorrectSum() {
        assertEquals(0l, (long) PrimeNumbers.getPrimeNumbersSum(-2));
        assertEquals(0l, (long) PrimeNumbers.getPrimeNumbersSum(0));
        assertEquals(0l, (long) PrimeNumbers.getPrimeNumbersSum(1));
        assertEquals(2l, (long) PrimeNumbers.getPrimeNumbersSum(2));
        assertEquals(5l, (long) PrimeNumbers.getPrimeNumbersSum(3));
        assertEquals(10l, (long) PrimeNumbers.getPrimeNumbersSum(5));
        assertEquals(17l, (long) PrimeNumbers.getPrimeNumbersSum(10));
    }

    @Test
    public void testIsPrimeNumbersShouldReturnCorrectJudgment() {
        assertFalse(PrimeNumbers.isPrimeNumber(-3));
        assertFalse(PrimeNumbers.isPrimeNumber(0));
        assertFalse(PrimeNumbers.isPrimeNumber(1));
        assertTrue(PrimeNumbers.isPrimeNumber(2));
        assertTrue(PrimeNumbers.isPrimeNumber(3));
        assertFalse(PrimeNumbers.isPrimeNumber(4));
        assertFalse(PrimeNumbers.isPrimeNumber(6));
        assertTrue(PrimeNumbers.isPrimeNumber(7));
        assertFalse(PrimeNumbers.isPrimeNumber(9));
        assertFalse(PrimeNumbers.isPrimeNumber(10));
        assertTrue(PrimeNumbers.isPrimeNumber(11));
        assertFalse(PrimeNumbers.isPrimeNumber(12));
        assertTrue(PrimeNumbers.isPrimeNumber(13));
        assertFalse(PrimeNumbers.isPrimeNumber(14));
        assertFalse(PrimeNumbers.isPrimeNumber(15));
        assertTrue(PrimeNumbers.isPrimeNumber(967));
        assertTrue(PrimeNumbers.isPrimeNumber(971));
        assertTrue(PrimeNumbers.isPrimeNumber(977));
        assertTrue(PrimeNumbers.isPrimeNumber(983));
        assertFalse(PrimeNumbers.isPrimeNumber(999));
        assertFalse(PrimeNumbers.isPrimeNumber(1000));
    }

    @Test
    public void testPrimeNumbersShouldReturnCorrectLengthOfNumbers() {
        assertEquals(0, PrimeNumbers.getPrimeNumbers(0).size());
        assertEquals(0, PrimeNumbers.getPrimeNumbers(1).size());
        assertEquals(1, PrimeNumbers.getPrimeNumbers(2).size());
        assertEquals(2, PrimeNumbers.getPrimeNumbers(3).size());
        assertEquals(3, PrimeNumbers.getPrimeNumbers(5).size());
        assertEquals(4, PrimeNumbers.getPrimeNumbers(7).size());
        assertEquals(4, PrimeNumbers.getPrimeNumbers(10).size());
    }

    @Test
    public void testPrimeNumbersShouldReturnCorrectNumbers() {
        assertEquals(2l, (long) PrimeNumbers.getPrimeNumbers(2).get(0));
        assertEquals(2l, (long) PrimeNumbers.getPrimeNumbers(3).get(0));
        assertEquals(3l, (long) PrimeNumbers.getPrimeNumbers(3).get(1));
        assertEquals(5l, (long) PrimeNumbers.getPrimeNumbers(5).get(2));
        assertEquals(7l, (long) PrimeNumbers.getPrimeNumbers(7).get(3));
        assertEquals(11l, (long) PrimeNumbers.getPrimeNumbers(11).get(4));
    }

    @Test
    public void testPrimeNumbersShouldContainCorrectNumbers() {
        assertTrue(PrimeNumbers.getPrimeNumbers(3).contains(3));
        assertTrue(PrimeNumbers.getPrimeNumbers(7).contains(3));
        assertTrue(PrimeNumbers.getPrimeNumbers(7).contains(5));
        assertTrue(PrimeNumbers.getPrimeNumbers(100).contains(97));
        assertTrue(PrimeNumbers.getPrimeNumbers(200).contains(199));
        assertTrue(PrimeNumbers.getPrimeNumbers(1000).contains(997));
    }

    /**
     * JUnit TimeOut Test
     * timeout = 300 - 1000 millisecond for 10_000_000 to 30_000_000 of numbers
     */
    @Test(timeout = 300)
    public void testPrimeNumbersSumShouldReturnBeforeTimeoutTenMillion() {
        int primeNumbers = 10_000_000;
        PrimeNumbers.getPrimeNumbersSum(primeNumbers);
    }

    @Test(timeout = 400)
    public void testPrimeNumbersShouldReturnBeforeTimeoutForTenMillion() {
        int primeNumbers = 10_000_000;
        PrimeNumbers.getPrimeNumbers(primeNumbers);
    }

    @Test(timeout = 1300)
    public void testPrimeNumbersSumShouldReturnBeforeTimeoutThirtyMillion() {
        int primeNumbers = 30_000_000;
        PrimeNumbers.getPrimeNumbersSum(primeNumbers);
    }

    @Test(timeout = 1300)
    public void testPrimeNumbersShouldReturnBeforeTimeoutThirtyMillion() {
        int primeNumbers = 30_000_000;
        PrimeNumbers.getPrimeNumbers(primeNumbers);
    }

}
