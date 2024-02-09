package streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExmp {
    public static List<String> wordsWithA(List<String> al) {
        Predicate<String> startsWithA = str -> str.toUpperCase().startsWith("A");
        List<String> resList=al.stream().
                                filter(startsWithA).
                                collect(Collectors.toList());
        return resList;
    }
}
