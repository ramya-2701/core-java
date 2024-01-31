package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class FactorialNumberTest {
    @Test
    public void testFactorialforPositive() {
        long x = 5;
        assertEquals(120, FactorialNumber.factorial(x));
    }
    @Test
    public void testFactorialforZero() {
        long x = 0;
        assertEquals(1, FactorialNumber.factorial(x));
    }

    @Test
    public void testFactorialforOne() {
        long x = 1;
        assertEquals(1, FactorialNumber.factorial(x));
    }

    @Test
    public void testFactorialforNegative() {
        long x = -5;
        FactorialNumber.factorial(x);
    }
}
