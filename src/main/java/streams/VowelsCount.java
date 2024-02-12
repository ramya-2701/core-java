package streams;
import java.util.ArrayList;
import java.util.List;

public class VowelsCount {
    public static List<String> countVowels(String[] strl) {
        List<String> stringsWithVowels = new ArrayList<>();
        int count = 0;
        for(String str:strl) {
            count=0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            if (count > 0) {
                stringsWithVowels.add(str + ":" + count);
            }
        }
        return stringsWithVowels;
    }
}
