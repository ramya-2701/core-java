package streams;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicatesTest {
    @Test
    public void testWithDuplicateNumbers(){
        List<Integer> alist = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6, 7, 3, 8, 9);
        List<Integer> expList=Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertEquals(expList,Duplicates.removeDuplicates(alist));
    }
    @Test
    public void testWithoutDuplicates(){
        List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8, 9);
        assertEquals(alist,Duplicates.removeDuplicates(alist));
    }
    @Test
    public void testEmptyList(){
        List<Integer> emplist= new ArrayList<Integer>();
        assertEquals(Collections.emptyList(),Duplicates.removeDuplicates(emplist));


    }
}
