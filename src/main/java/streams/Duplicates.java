package streams;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static List<Integer> removeDuplicates(List<Integer> arrlist){
        List<Integer> resList=arrlist.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
        return resList;
    }
}
