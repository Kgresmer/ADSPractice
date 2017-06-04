package main.numbers;

/**
 * Created by user on 6/3/2017.
 */
public class MultiplesOfThreeAndFive
{

    public static void main(String[] args) {
        int count = 999;
        int sum = 0;
        while (count > 0) {
            if (count%3 == 0 || count%5 == 0) {
                sum += count;
            }
            count--;
        }
        System.out.println(sum);
    }
}
