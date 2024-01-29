package arrayList;
import java.util.ArrayList;
public class TraversalList {
    public static ArrayList<String> traverseArrayList(ArrayList<String> stringList) {

        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String element = stringList.get(i);
            System.out.print(element);
        }
        return stringList;
    }

}
