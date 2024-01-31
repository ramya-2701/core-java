package functionalInterfaces;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class SwappingIntegersTest {
    @Test
    public void testforPositiveNumbers() {
        int a = 5;
        int b = 6;
        int[] result = SwappingIntegers.swapNumbers(a, b);
        assertArrayEquals(new int[]{6, 5}, result);
    }
    @Test
    public void testforNegativeNumbers() {
        int a = -1;
        int b = -4;
        int[] result = SwappingIntegers.swapNumbers(a, b);
        assertArrayEquals(new int[]{-4, -1}, result);
    }
    @Test
    public void testforSameNumbers() {
        int a = 4;
        int b = 4;
        int[] result = SwappingIntegers.swapNumbers(a, b);
        assertArrayEquals(new int[]{4, 4}, result);
    }
}
