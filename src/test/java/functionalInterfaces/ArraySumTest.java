package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class ArraySumTest {
    @Test
    public void testforPositiveIntegers(){
        int arr[]={4,6,7,8,1,2,2};
        assertEquals(30, ArraySum.sumOfArray(arr));
    }
    @Test
    public void testforEmptyArray(){
        int arr[]={};
        assertEquals(0, ArraySum.sumOfArray(arr));
    }
}
