package hashMap;
import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
    public static void printCharacterCounts(String inputString) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.printf("%c-%d, ", entry.getKey(), entry.getValue());
        }
    }
}
