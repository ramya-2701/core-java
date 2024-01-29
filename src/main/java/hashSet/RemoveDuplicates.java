package hashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicatesChars(String input) {
        Set<Character> chars = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (chars.add(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
