package streams;
import java.util.ArrayList;

public class AverageNum {
    public static double avgNumber(ArrayList<Integer> al){
        double av = al.stream()
                .filter(a -> a % 2 != 0)
                .mapToDouble(a->a*a)
                .average()
                .orElse(0.0);
        return av;
    }

}
