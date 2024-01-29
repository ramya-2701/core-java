package javaStrings;
import java.util.Arrays;
public class StringAnagram {

    public static boolean findAnagram(String s,String s1){
        if(s==null||s1==null){
            return false;
        }
        s=s.replaceAll("\\s","").toLowerCase();
        s1=s1.replaceAll("\\s","").toLowerCase();
        if(s.length()!=s1.length()){
            return false;
        }
        else {
            char[] c1 = s.toCharArray();
            char[] c2 = s1.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
    public static void main(String[] args){
         String s="The Morse Code";
         String s1="Here come dots";
        System.out.println(findAnagram(s,s1));
    }

}
