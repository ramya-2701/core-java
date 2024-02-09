package streams;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
public class CapitalizeTest {
    @Test
    public void testWithUnsortedInput(){
        String[] stringArray = {"Apple", "Banana", "Orange", "Grape", "Kiwi", "Apricot"};
        List<String> resList=Capitalize.capitalizeFirstLetter(stringArray);
        assertEquals("Apricot",resList.get(1));
    }
    @Test
    public void testWithSmallLetter(){
        String[] stringArray = {"apple", "Banana", "orange", "grape", "kiwi", "Apricot"};
        List<String> resList=Capitalize.capitalizeFirstLetter(stringArray);
        assertEquals("Grape",resList.get(3));
    }
    @Test
    public void testEmptyList(){
        String[] stringArray = {};
        List<String> resList=Capitalize.capitalizeFirstLetter(stringArray);
        assertTrue(resList.isEmpty());


    }
}
