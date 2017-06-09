package main.arrays;

import java.lang.reflect.Array;
import java.util.stream.Stream;

/**
 * Created by chq-keving on 6/9/2017.
 */
public class constructors {

    public static void main(String[] args) {
        String[] strings = (String[]) Array.newInstance(args[0].getClass(), 1);
        System.arraycopy(strings, 0, strings, strings.length, strings.length);


        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        //join object type array
        String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
    }
}
