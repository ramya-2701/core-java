package functionalInterfaces;
import java.util.HashMap;
import java.util.Map;
public class UniqueWords {
        public static Map<String, Integer> countUniqueWords(String str) {
            if (str == null) {
                System.out.println("Input string cannot be null");
            }
            HashMap<String, Integer> wordCountMap = new HashMap<>();
            String[] words = str.split("\\s+");

            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            return wordCountMap;
        }

}
