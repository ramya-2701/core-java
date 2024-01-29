package arrayList;
import org.junit.Test;
import java.util.ArrayList;
import arrayList.RemoveLastObject;
import static org.junit.Assert.*;
public class RemoveLastObjectTest {
    @Test
    public void testRemoveObject() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        ArrayList<String> result = RemoveLastObject.removeObject(stringList);
        assertNotNull(result);

    }
    @Test
    public void testRemoveObjectEmptyList() {
        ArrayList<String> emptyList = new ArrayList<>();
        ArrayList<String> result = RemoveLastObject.removeObject(emptyList);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}
