package test.strings;

import main.strings.ReplaceChars;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharsTest {

    @Test
    public void replaceChars() throws Exception {
        assertEquals("Zsdfgh", ReplaceChars.replace("asdfgh", 'a'));
    }

    @Test
    public void replaceCharsMultiple() throws Exception {
        assertEquals("ZsdZfghZ", ReplaceChars.replace("asdafgha", 'a'));
    }

    @Test
    public void replaceCharsMultipleNExtToEachOther() throws Exception {
        assertEquals("ZsdZZZfgh", ReplaceChars.replace("asdaaafgh", 'a'));
    }

    @Test
    public void replaceCharsNullString() throws Exception {
        assertNull(ReplaceChars.replace(null, 'a'));

    }

    @Test
    public void replaceCharsCharNotFound() throws Exception {
        assertEquals("asdfgh", ReplaceChars.replace("asdfgh", 't'));

    }

    @Test
    public void replaceCharsEmptyString() throws Exception {
        assertEquals("", ReplaceChars.replace("", 'a'));

    }


}