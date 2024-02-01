package functionalInterfaces;
import java.util.*;

public class HashMapSort {
        public static Map<String, Integer> mapSort(Map<String, Integer> hashMap) {
            TreeMap<String, Integer> srtdmap = new TreeMap<>(hashMap);
            for (Map.Entry<String, Integer> entry : srtdmap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            return srtdmap;
        }
}
