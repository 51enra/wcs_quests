package algo;

import junit.framework.TestCase;
import org.junit.Test;

public class CipherTest extends TestCase {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testEncrypt() throws Exception {
        assertEquals("bcde", Cipher.caesar("abcd", 1));
        assertEquals("zabc", Cipher.caesar("abcd", -1));
        assertEquals("wdfrv", Cipher.caesar("tacos", 3));
        assertEquals("bgdtc", Cipher.caesar("zebra", 2));
    }
}