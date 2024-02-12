
package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {
    public static List<String> sortingArray(String[] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparing(String::length).reversed())
                        .thenComparing(Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }
}

