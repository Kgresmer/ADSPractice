package main.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by chq-keving on 2/28/2017.
 */
public class FindAllUniqueChars {

    public static Set<Character> findUniqueCharsUsingSet(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            uniqueChars.add(input.charAt(i));
        }
        return uniqueChars;
    }

    public static char[] findUniqueCharsWithoutDS(String input) {
        char[] uniqueChars = new char[256];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i);
            uniqueChars[index] = input.charAt(i);
        }
        return uniqueChars;
    }

    public static boolean doesStringContainOnlyUniqueChars(String input) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            //charAt will find the first instance of that character.
            // If there is more than one it will find the same index twice and therefore not be all unique.
            int index = input.charAt(i);
            if (charSet[index]) return false;
            charSet[index] = true;
        }
        return true;
    }

    public static boolean doesStringContainOnlyUniqueCharsNoBoolean(String input) {
        Map<Character, Integer> values = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (values.get(c) == null) {
                values.put(c, 1);
            } else {
                values.put(c, values.get(c)+1);
            }
        }
        return values.keySet().size() == input.length();
    }
}
