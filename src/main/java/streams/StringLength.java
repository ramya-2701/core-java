package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLength {
    public static Map<Integer,List<String>> groupStringbyLength(String[] arr) {
        List<String> strings = Arrays.asList(arr);
        Map<Integer, List<String>> groupedStrings = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        return groupedStrings;
    }
}
