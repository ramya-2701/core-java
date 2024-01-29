package arrayList;
import java.util.ArrayList;
public class ArrayListTraversal {
    public static ArrayList<String> traversalList(ArrayList<String> stringList) {
        for (String element : stringList) {
            System.out.println(element);
        }
        return stringList;
    }

}
