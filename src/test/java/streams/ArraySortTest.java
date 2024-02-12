package streams;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class ArraySortTest {
    @Test
    public void testWithPositiveCase(){
        String[] arr={"apple","banana","orange","kiwi","pear"};
        List<String> resList=ArraySort.sortingArray(arr);
        assertEquals("kiwi",resList.get(1));
    }
    @Test
    public void testWithEmptyList(){
        String[] arr={};
        List<String> resList=ArraySort.sortingArray(arr);
        assertTrue(resList.isEmpty());
    }
}
