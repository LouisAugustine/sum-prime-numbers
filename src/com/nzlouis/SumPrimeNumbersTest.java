package com.nzlouis;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

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
    public void testPrimeNumbersShouldReturnCorrectNumber() {
        assertEquals(2l, (long) SumPrimeNumbers.getPrimeNumbers(2).get(0));
        assertEquals(2l, (long) SumPrimeNumbers.getPrimeNumbers(3).get(0));
        assertEquals(3l, (long) SumPrimeNumbers.getPrimeNumbers(3).get(1));
    }

    @Test(timeout = 50)
    public void testPrimeNumbersSumShouldReturnBeforeTimeout() {
        int primeNumbers = 1_000_000;
        SumPrimeNumbers.getPrimeNumbersSum(primeNumbers);
    }


    }
