package functionalInterfaces;
import java.util.ArrayList;
import java.util.Collections;

public class ListReverse {
    public static ArrayList<String> arrayListReverse(ArrayList<String> strlist){
        Collections.reverse(strlist);
        return strlist;
    }

}
