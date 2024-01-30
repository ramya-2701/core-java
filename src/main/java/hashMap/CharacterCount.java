package hashMap;
import java.util.HashMap;
public class CharacterCount {
    public static void countCharacters(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is null or empty");
            return;
        }
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : charCountMap.keySet()) {
            System.out.print(c + "-" + charCountMap.get(c) + ", ");
        }
        System.out.println();
    }
}
