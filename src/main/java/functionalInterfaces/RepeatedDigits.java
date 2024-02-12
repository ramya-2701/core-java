package functionalInterfaces;
import java.util.HashMap;
import java.util.Map;
public class RepeatedDigits {
    public static String findRepeatedDigits(int n) {
        Map<Character, Integer> digitMap = new HashMap<>();
        String numberStr = Integer.toString(n);
        for (char digit : numberStr.toCharArray()) {
            digitMap.put(digit, digitMap.getOrDefault(digit, 0) + 1);
        }
        StringBuilder repeatedDigitsBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : digitMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedDigitsBuilder.append(entry.getKey()).append(" ");
            }
        }
        return repeatedDigitsBuilder.toString().trim();
    }
}
