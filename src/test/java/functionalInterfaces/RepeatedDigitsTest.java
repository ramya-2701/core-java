package functionalInterfaces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RepeatedDigitsTest {
    @Test
    public void testOneRepeatedDigits() {
        String result1 = RepeatedDigits.findRepeatedDigits(122345);
        assertEquals("2", result1);
    }
    @Test
    public void testMultipleRepeatedDigits() {
        String result2 = RepeatedDigits.findRepeatedDigits(112233);
        assertEquals("1 2 3", result2);
    }
    @Test
    public void testNoRepeatedDigits() {
        String result3 = RepeatedDigits.findRepeatedDigits(123456);
        assertEquals("", result3);
    }

}
