package functionalInterfaces;
import javaStrings.StringRotation;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest {
    @Test
    public void testAreRotations_successful() {
        assertTrue(javaStrings.StringRotation.isRotation("abcde", "cdeab"));
    }

    @Test
    public void testAreRotations_nullInput() {
        assertFalse(javaStrings.StringRotation.isRotation(null, "test"));
        assertFalse(javaStrings.StringRotation.isRotation("test", null));
        assertFalse(javaStrings.StringRotation.isRotation(null, null));
    }

    @Test
    public void testAreRotations_differentLength() {
        assertFalse(javaStrings.StringRotation.isRotation("hello", "world"));
    }

    @Test
    public void testAreRotations_notRotations() {
        assertFalse(javaStrings.StringRotation.isRotation("hello", "holla"));
    }

    @Test
    public void testAreRotations_zeroInput() {
        assertTrue(StringRotation.isRotation("", ""));
    }

}
