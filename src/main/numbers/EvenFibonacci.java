package main.numbers;

/**
 * Created by user on 6/3/2017.
 */
public class EvenFibonacci
{

    public static void main(String[] args) {
        int[] fib = new int[1000];
        fib[0] = 1;
        fib[1] = 2;
        int sum = 2;
        for (int i = 2; sum < 4000000; i++) {
            fib[i] = fib[i - 1] + fib[i -2];
            if (fib[i]%2 == 0) {
                sum += fib[i];
            }
        }
        System.out.println("sum: " + sum);

    }
}

