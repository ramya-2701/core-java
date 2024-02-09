package streams;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
public class StringLengthTest {
    @Test
    public void testWithSameLengthStrings(){
        String[] arr={"apple","banana","orange","kiwi","pear"};
        Map<Integer, List<String>> resMap=StringLength.groupStringbyLength(arr);
        assertEquals(2,resMap.get(6).size());
    }
    @Test
    public void testWithdifferentStrings(){
        String[] arr={"a","ab","abc","abcd"};
        Map<Integer, List<String>> resMap=StringLength.groupStringbyLength(arr);
        assertNotEquals(2,resMap.get(4).size());
    }
    @Test
    public void testWithEmptyString(){
        String[] arr={};
        Map<Integer, List<String>> resMap=StringLength.groupStringbyLength(arr);
        assertTrue(resMap.isEmpty());
    }
}
