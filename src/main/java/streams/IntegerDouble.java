package streams;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class IntegerDouble {
    public static List<Integer> doubleOddNumbers(List<Integer> alist){
        List<Integer> evenList=alist.stream().filter(e->e%2==0).collect(Collectors.toList());
        List<Integer> resultList=alist.stream().
                                    filter(o->o%2!=0).
                                    map(o->o*2).
                                    collect(Collectors.toList());
        return resultList;
    }

}
