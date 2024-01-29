package javaStrings;

import org.junit.Test;
import javaStrings.StringAnagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringAnagramTest {

    @Test
    public void testAreAnagrams_successful() {
        assertTrue(StringAnagram.findAnagram("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_nullInput() {
        assertFalse(StringAnagram.findAnagram(null, "test"));
        assertFalse(StringAnagram.findAnagram("test", null));
        assertFalse(StringAnagram.findAnagram(null, null));
    }

    @Test
    public void testAreAnagrams_differentLength() {
        assertFalse(StringAnagram.findAnagram("hello", "world"));
    }

    @Test
    public void testAreAnagrams_notAnagrams() {
        assertFalse(StringAnagram.findAnagram("hello", "holla"));
    }

    @Test
    public void testAreAnagrams_zeroInput() {
        assertTrue(StringAnagram.findAnagram("", ""));
    }
}
