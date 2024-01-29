package arrayList;
import java.util.ArrayList;
public class RemoveLastObject {
    public static ArrayList<String> removeObject(ArrayList<String> stringList){
        if(stringList.isEmpty()){
            System.out.println("empty list");
        }else {
            int l = stringList.size();
            stringList.remove(l - 1);
            System.out.println(stringList);
        }
            return stringList;
    }

}
