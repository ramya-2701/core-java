package javaStrings;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class WordReverseTest {

    @Test
    public void testReverseWords_successful() {
        assertArrayEquals(new String[]{"Java", "J2EE", "Reverse", "Me"}, WordReverse.stringReverse("avaJ EE2J esreveR eM"));
    }
    @Test
    public void testReverse_SingleWord(){
        assertArrayEquals(new String[]{"abc"}, WordReverse.stringReverse("cba"));

    }
    @Test
    public void testnull_string(){
        assertArrayEquals(new String[]{}, WordReverse.stringReverse(""));
    }

}