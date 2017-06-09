package main.numbers;

/**
 * Created by chq-keving on 6/9/2017.
 */
public class SmallestPrimeEvenPosition {

    public static void main(String[] args) {
        int[] vector = new int[]{5,6,8,9,11,14,16,18,20,25};
        Integer result = null;
        for (int i = 1; i < vector.length; i += 2 ) {
            if (vector[i] % 2 != 0) {
                int current = vector[i];
                boolean cp = true;
                for (int j = 2; j < current; j++) {
                    if (current%j == 0) {
                        cp = false;
                        break;
                    }
                }
                if (cp && result == null || cp && current < result) {
                    result = current;
                }
            }
        }
        if (result == null) result = 0;
        if (result != null) {
            System.out.println(result > 0 ? result : "NULL");
        }
    }
}
