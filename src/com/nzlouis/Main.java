package com.nzlouis;

public class Main {

    public static void main(String[] args) {
        int primeNumbers = 10_000_000;

        System.out.println("Function 1--------------");
        long start1 = System.currentTimeMillis();
        System.out.println(PrimeNumbers.getPrimeNumbers(primeNumbers));
        long end1 = System.currentTimeMillis();
        System.out.println("The time cost is: " + (end1 - start1) + " millisecond");

        System.out.println("Function 2--------------");
        long start2 = System.currentTimeMillis();
        System.out.println("sum:" + PrimeNumbers.getPrimeNumbersSum(primeNumbers).toString());
        long end2 = System.currentTimeMillis();
        System.out.println("The time cost is: " + (end2 - start2) + " millisecond");
    }
}
