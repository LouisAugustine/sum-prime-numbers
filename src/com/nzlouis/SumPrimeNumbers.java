package com.nzlouis;

import java.util.ArrayList;
import java.util.List;

public class SumPrimeNumbers {

    public static Long getPrimeNumbersSum(int number) {
        if(number <= 1)
            return 0l;
        if(number == 2)
            return 2l;
        if(number > 2147483647){
            throw new IllegalArgumentException();
        }

        Long sum = 0l;
        boolean[] arr = new boolean[number + 1];// Default false

        int index = 2;// Prime numbers start at 2
        while (index <= number) {
            if (!arr[index]) {// If it is a prime number
                int k = 2;
                while (index * k <= number) {//Set integer multiple to true
                    arr[index * k] = true;
                    k++;
                }
            }
            index++;
        }

        for (int i = 2; i <= number; i++) {
            if (!arr[i]){
                sum += i;
            }
        }

        return sum;
    }

    public static List<Integer> getPrimeNumbers(int number) {
        List<Integer> list = new ArrayList<>();
        if(number <= 1)
            return list;
        if(number == 2){
            list.add(2);
            return list;
        }
        if(number > 2147483647){
            throw new IllegalArgumentException();
        }

        Long sum = 0l;
        boolean[] arr = new boolean[number + 1];// Default false

        int index = 2;// Prime numbers start at 2
        System.out.println();
        while (index <= number) {
            if (!arr[index]) {// If it is a prime number
                int k = 2;
                while (index * k <= number) {//Set integer multiple to true
                    arr[index * k] = true;
                    k++;
                }
            }
            index++;
        }

        for (int i = 2; i <= number; i++) {
            if (!arr[i]){
                list.add(i);
                sum += i;
            }
        }

        return list;
    }

}
