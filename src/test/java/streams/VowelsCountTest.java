package streams;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class VowelsCountTest {
    @Test
    public void testWithStringArray(){
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};
        List<String> resList=VowelsCount.countVowels(fruits);
        assertEquals("apple:2",resList.get(0));
    }
    @Test
    public void testEmptyList(){
        String[] s={};
        List<String> resList=VowelsCount.countVowels(s);
        assertTrue(resList.isEmpty());
    }
}
