package streams;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class AverageNumTest {
    @Test
    public void testPositiveNumber(){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(5);
        double a=AverageNum.avgNumber(al);
        assertEquals(11.6,a,2);
    }
    @Test
    public void testNegativeNumber(){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(-1);
        al.add(4);
        al.add(3);
        al.add(-5);
        double a=AverageNum.avgNumber(al);
        assertEquals(11.6,a,2);
    }

    @Test
    public void testemptyList(){
        ArrayList<Integer> al1=new ArrayList<Integer>();
        double a1=AverageNum.avgNumber(al1);
        assertEquals(0,a1,2);
    }
}
