package streams;

import java.util.ArrayList;

public class Square {
    public static double positiveNumSquare(ArrayList<Integer> al){
        double result=al.stream().
                filter(a->a>0).
                mapToDouble(a->a*a).
                sum();
        System.out.println(result);
        return result;
    }
}
