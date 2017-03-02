package test.strings;

import main.strings.Anagram;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 12/29/2016.
 */
public class AnagramTest {

    @Test
    public void testAnagram() {
        assertTrue(Anagram.checkForAnagram("trees", "srete"));
        assertTrue(Anagram.anagram("trees", "srete"));
    }

}