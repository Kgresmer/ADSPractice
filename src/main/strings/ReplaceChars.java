package main.strings;

public class ReplaceChars {

    public static String replace(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        StringBuilder finalProduct = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (str.charAt(i) == ch) {
                finalProduct.append('Z');
            } else {
                finalProduct.append(str.charAt(i));
            }
        }

        return finalProduct.toString();
    }

}
