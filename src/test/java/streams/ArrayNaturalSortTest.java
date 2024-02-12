package streams;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ArrayNaturalSortTest {
    @Test
    public void testWithPositiveCase(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Add");
        stringList.add("Animal");
        stringList.add("orange");
        assertEquals("orange",ArrayNaturalSort.arraySort(stringList));
    }
    @Test
    public void testEmptyList(){
        ArrayList<String> stringList = new ArrayList<>();
        String s=ArrayNaturalSort.arraySort(stringList);
        assertEquals("",s);

    }
}
