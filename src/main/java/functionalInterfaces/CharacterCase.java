package functionalInterfaces;
import java.lang.String;
public class CharacterCase {
    public static String replaceCase(String str){
        char[] carray=str.toCharArray();
        for(int i=0;i<carray.length;i++){
            if(Character.isUpperCase(carray[i])){
               carray[i]=Character.toLowerCase(carray[i]);
            }
            else if(Character.isLowerCase(carray[i])){
                carray[i]=Character.toUpperCase(carray[i]);
            }
        }
        return new String(carray);
    }
}
