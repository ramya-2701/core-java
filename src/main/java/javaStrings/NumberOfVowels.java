package javaStrings;
import java.lang.String;

public class NumberOfVowels {

    public static int vowelCount(String s) {
        if(s==null){
            return 0;
        }
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfVowels nv = new NumberOfVowels();
        String s = "ramya";
        int cnt = vowelCount(s);
        System.out.println(cnt);
    }
}