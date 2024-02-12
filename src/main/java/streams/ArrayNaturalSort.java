package streams;

import java.util.ArrayList;
import java.util.List;

public class ArrayNaturalSort {
    public static String arraySort(ArrayList<String> al){
        String result="";
        if(al.isEmpty()){
            System.out.println("List is empty");
        }
        else {
             result = al.stream().max(String::compareTo).get();
        }
        return result;
    }
}
