package main.numbers;

/**
 * Created by chq-keving on 6/5/2017.
 */
public class SmallestMultiple {

//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static void main(String[] args) {

        boolean foundMult = false;
        int current = 2520;
        while (!foundMult) {
            foundMult = checkIfMult(current);
            if (!foundMult) current++;
        }
        System.out.println(current);
    }

    private static boolean checkIfMult(int x) {
        for (int i = 1; i <= 20; i++) {
            if (x % i != 0) {
                return false;
            }
        }
        return true;
    }
}
