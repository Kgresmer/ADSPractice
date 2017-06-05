package main.numbers;

/**
 * Created by user on 6/4/2017.
 */
public class LargestPrimeFactors {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?

    public static void main(String[] args) {
        System.out.println(checkLargestPrimeFactor(600851475143L));
    }

    private static long checkLargestPrimeFactor(long input) {
        long highest = 1;
        if (input <= 1 || input == 2 || input == 3) {
            return input;
        }
        for (long i = 3; i*i < input; i+= 2) {
            if (input%i == 0) {
                boolean prime = false;
                if (i%2 == 0) continue;
                for(long j=3; j*j<i; j+= 2){
                    if(i%j==0){
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }
                }
                if (prime) {
                    highest = i;
                }
            }
        }
        return highest;
    }
}
