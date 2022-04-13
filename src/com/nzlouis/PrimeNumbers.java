package com.nzlouis;

import java.util.*;

/**
 * PrimeNumbers class
 * @author Louis
 *
 */
public class PrimeNumbers {

    static boolean[] primeNumbersArray = new boolean[50_000_000];

    /**
     * Find the sum of all prime numbers up to number
     * @param number
     * @return long sum
     */
    public static Long getPrimeNumbersSum(int number) {
        if(number <= 1)
            return 0l;
        if(number == 2)
            return 2l;
        if(number > 2147483647)
            throw new IllegalArgumentException();

        initializePrimeNumberArray(number);
        Long sum = 0l;
        for (int i = 2; i <= number; i++){
            if (!primeNumbersArray[i]){
                sum += i;
            }
        }

        return sum;
    }

    /**
     * Find all prime numbers up to number
     * @param number
     * @return List<Integer>
     */
    public static List<Integer> getPrimeNumbers(int number) {
        List<Integer> list = new ArrayList<>();
        if(number <= 1)
            return list;
        if(number == 2){
            list.add(2);
            return list;
        }
        if(number > 2147483647)
            throw new IllegalArgumentException();

        initializePrimeNumberArray(number);
        Long sum = 0l;
        for (int i = 2; i <= number; i++) {
            if (!primeNumbersArray[i]){
                list.add(i);
                sum += i;
            }
        }

        return list;
    }

    /**
     * Check if it's prime number
     * @param number
     * @return Boolean
     */
    public static Boolean isPrimeNumber (int number) {
        if(number <= 1)
            return false;
        initializePrimeNumberArray(number);
        if (!primeNumbersArray[number]){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Check if it's prime number
     * @param number
     * @return Boolean
     */
    public static void initializePrimeNumberArray (int number) {
        int index = 2;// Prime numbers start at 2
        System.out.println();
        while (index <= number) {
            if (!primeNumbersArray[index]) {// If it is a prime number
                int k = 2;
                while (index * k <= number) {//Set integer multiple to true
                    primeNumbersArray[index * k] = true;
                    k++;
                }
            }
            index++;
        }
    }



}
