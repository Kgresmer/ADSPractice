package main.numbers;

/**
 * Created by user on 6/4/2017.
 */
public class LargestPalindromeProduct {
//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//    Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args) {
        System.out.println("1 digits " + getLargestPalindrome(1));
        System.out.println("2 digits " + getLargestPalindrome(2));
        System.out.println("3 digits " + getLargestPalindrome(3));
        System.out.println("4 digits " + getLargestPalindrome(4));
    }

    private static int getLargestPalindrome(int numOfDigits) {
        int maxNum;
        int minNum;
        int largestP = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int d = 0; d < numOfDigits; d++) {
            sb.append("9");
            sb2.append("1");
        }
        maxNum = Integer.parseInt(sb.toString());
        minNum = Integer.parseInt(sb2.toString());
        while (minNum <= maxNum) {
            for (int i = minNum; i < maxNum; i++) {
                if (isPalidrome(i * maxNum)) {
                    if ((i * maxNum) > largestP) {
                        largestP = i * maxNum;
                    }
                }
            }
            maxNum--;
        }
        return largestP;
    }

    private static boolean isPalidrome(int input) {
        if (input >= -9 && input <= 9) return true;
        String number = String.valueOf(input);
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length/2; i++) {
            if (digits[i] != digits[digits.length - (1 + i)]) {
                return false;
            }
        }
        return true;
    }
}
