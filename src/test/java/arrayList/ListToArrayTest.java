package arrayList;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;
import arrayList.ListToArray;
public class ListToArrayTest {

    @Test
    public void testConvert_ToArray() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        String[] result = ListToArray.conversion(stringList);
        assertNotNull(result);
        assertEquals(stringList.size(), result.length);
        assertArrayEquals(stringList.toArray(new String[0]), result);
    }

    @Test
    public void testEmptyList() {
        ArrayList<String> emptyList = new ArrayList<>();
        String[] result = ListToArray.conversion(emptyList);
        assertNotNull(result);
        assertEquals(0, result.length);
    }
}