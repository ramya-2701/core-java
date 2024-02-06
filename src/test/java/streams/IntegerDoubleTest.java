package streams;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntegerDoubleTest {
    @Test
    public void testWithOddNumbers(){
        List<Integer> arrlist=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> explist=Arrays.asList(2,6,10,14,18);
        assertEquals(explist,IntegerDouble.doubleOddNumbers(arrlist));
    }
    @Test
    public void testWithEmptyList(){
        List<Integer> emplist= new ArrayList<Integer>();
        assertEquals(Collections.emptyList(),IntegerDouble.doubleOddNumbers(emplist));
    }
}
