package functionalInterfaces;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;
public class HashMapSortTest {
    @Test
    public void testHashMapSort() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 30);
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 35);
        hashMap.put("Eve", 28);
        Map<String, Integer> sortedMap = HashMapSort.mapSort(hashMap);
        Map<String, Integer> expectedMap = new TreeMap<>(hashMap);
        assertIterableEquals(expectedMap.keySet(), sortedMap.keySet());
        assertIterableEquals(expectedMap.values(), sortedMap.values());
    }
    @Test
    public void testEmptyMapSort() {
        Map<String, Integer> emptyMap = new HashMap<>();
        Map<String, Integer> sortedEmptyMap = HashMapSort.mapSort(emptyMap);
        assertTrue(sortedEmptyMap.isEmpty());
    }
}
