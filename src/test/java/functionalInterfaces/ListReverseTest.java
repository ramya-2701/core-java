package functionalInterfaces;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ListReverseTest {
    @Test
    public void testArrayListReverse(){
        ArrayList<String> al=new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        ArrayList<String> explist=new ArrayList<String>();
        explist.add("d");
        explist.add("c");
        explist.add("b");
        explist.add("a");
        assertEquals(explist,ListReverse.arrayListReverse(al));
    }
    @Test
    public void testEmptyList(){
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> ol=ListReverse.arrayListReverse(al);
        assertTrue(ol.isEmpty());
    }
}
