package functionalInterfaces;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;
public class UniqueWordsTest {
        @Test
        public void testPositiveResponse() {
            String input = "java hello world hello world";
            Map<String, Integer> result = UniqueWords.countUniqueWords(input);
            assertEquals(3, result.size());
            assertEquals(2, (int) result.get("hello"));
            assertEquals(1, (int) result.get("java"));
        }
        @Test
        public void testNegativeResponse() {
            String input = "hello hello world world";
            Map<String, Integer> result = UniqueWords.countUniqueWords(input);

            assertEquals(2, result.size());
            assertEquals(2, (int) result.get("hello"));
            assertEquals(2, (int) result.get("world"));
        }


}
