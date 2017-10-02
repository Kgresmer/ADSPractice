package main.arrays;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Created by kgresmer on 12/26/2016.
 */

public class Fibonacci {

    private static HashMap<Integer, Integer> numbers = new HashMap<>();

    {
        numbers.put(1, 1);
        numbers.put(2, 1);
    }

    public static BigInteger findInSeries(int n) {
        BigInteger[] series = new BigInteger[n + 1];
        series[0] = BigInteger.valueOf(0);
        series[1] = BigInteger.valueOf(1);

        // loop starting at 2, (value - 1) + (value - 2)

        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1].add(series[i - 2]);
        }
        return series[n];
    }

    public static int findInSeriesRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return findInSeriesRecursion(n-1) + findInSeriesRecursion(n-2);
    }

    public static int fibWithMemory(int numberInSeries) {
        Integer number = numbers.get(numberInSeries);
        if (number != null) {
            return number;
        }

        number = fib(numberInSeries);
        numbers.put(numberInSeries, number);
        return number;
    }

    private static int fib(int numberInSeq) {
        int a = 0;
        int b = 1;
        int newTotal = 0;

        for (int i = 2; i <= numberInSeq; i++) {
            newTotal = a + b;
            a = b;
            b = newTotal;
        }
        return newTotal;
    }

}
