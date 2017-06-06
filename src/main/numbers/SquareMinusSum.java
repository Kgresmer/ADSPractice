package main.numbers;

import java.math.BigInteger;

/**
 * Created by chq-keving on 6/6/2017.
 */
public class SquareMinusSum {
    public static void main(String[] args) {
        System.out.println(squareMinusSum(100));
        System.out.println(sum(100).subtract(square(100)));
    }

    private static long squareMinusSum(int numOfDigits) {
        long square = 0L;
        long sum = 0L;
        int sumOfDigits = 0;
        for (int i = 1; i <= numOfDigits; i++) {
            sumOfDigits += i;
            sum += Math.pow(i, 2);
        }
        square = (long) Math.pow(sumOfDigits, 2);
        return square - sum;
    }

    private static BigInteger square(int numOfDigits) {
        return BigInteger.valueOf((numOfDigits*(numOfDigits+1)*(2*numOfDigits + 1))/6);
    }

    private static BigInteger sum(int numOfDigits) {
        return BigInteger.valueOf(numOfDigits*(numOfDigits+1)/2).pow(2);
    }
}
