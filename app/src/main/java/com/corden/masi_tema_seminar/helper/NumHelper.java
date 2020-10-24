package com.corden.masi_tema_seminar.helper;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class NumHelper {
    public static boolean isPrime(int number){
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static List<Integer> factoriseNum(int number){
        List<Integer> factors = new LinkedList<>();
        int p = 2;
            while (number % p == 0 && number > 0) {
                factors.add(p);
                number = number / p;
                p += 1;
                if (p > number / p)
                    break;
            }
        if (number > 1)
            factors.add(number);
        return factors;
    }
}
