package streams;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class PredicateExmpTest {
    @Test
    public void testWithCapitalA(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Add");
        stringList.add("Animal");
        stringList.add("orange");
        assertEquals(3,PredicateExmp.wordsWithA(stringList).size());
    }
    @Test
    public void testWithSmalla(){
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("add");
        stringList.add("orange");
        assertEquals(2,PredicateExmp.wordsWithA(stringList).size());

    }
    @Test
    public void testWithMixedLetters(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("add");
        stringList.add("Animal");
        stringList.add("orange");
        assertEquals(3,PredicateExmp.wordsWithA(stringList).size());
    }
    @Test
    public void testWithEmptyList(){
        List<String> stringList = new ArrayList<>();
        assertTrue(stringList.isEmpty());
    }
}
