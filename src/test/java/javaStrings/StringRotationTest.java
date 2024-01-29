package javaStrings;

import org.junit.Test;
import javaStrings.StringRotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest {

    @Test
    public void testAreRotations_successful() {
        assertTrue(StringRotation.isRotation("abcde", "cdeab"));
    }

    @Test
    public void testAreRotations_nullInput() {
        assertFalse(StringRotation.isRotation(null, "test"));
        assertFalse(StringRotation.isRotation("test", null));
        assertFalse(StringRotation.isRotation(null, null));
    }

    @Test
    public void testAreRotations_differentLength() {
        assertFalse(StringRotation.isRotation("hello", "world"));
    }

    @Test
    public void testAreRotations_notRotations() {
        assertFalse(StringRotation.isRotation("hello", "holla"));
    }

    @Test
    public void testAreRotations_zeroInput() {
        assertTrue(StringRotation.isRotation("", ""));
    }
}