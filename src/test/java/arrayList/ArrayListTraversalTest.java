package arrayList;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTraversalTest {
    @Test
    public void testSucess_ArrayList(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");
        ArrayList<String> result = ArrayListTraversal.traversalList(stringList);
        assertEquals(stringList, result);
    }
    @Test
    public void testEmpty_ArrayList() {
        ArrayList<String> emptyList = new ArrayList<>();
        ArrayList<String> result = ArrayListTraversal.traversalList(emptyList);
        assertTrue(result.isEmpty());
    }
}