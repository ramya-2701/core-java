package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalize {
    public static List<String> capitalizeFirstLetter(String[] arr){
        List<String> resList= Arrays.stream(arr).
                                map(str->str.substring(0,1).toUpperCase()+str.substring(1)).
                                sorted().
                                collect(Collectors.toList());
        System.out.println(resList);
        return resList;
    }
}
