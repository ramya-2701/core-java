package streams;
import static org.junit.Assert.*;
import org.junit.Test;
public class AdditionTest {
    @Test
    public void testPositiveNum(){
        int x=5;int y=1;
        assertEquals(6,Addition.addNumbers(x,y));
    }
    @Test
    public void testWithNegativeNum(){
        int x=-4;
        int y=-4;
        assertEquals(-8,Addition.addNumbers(x,y));
    }
    @Test
    public void testWithZeroInput(){
        int x=0;
        int y=0;
        assertEquals(0,Addition.addNumbers(x,y));
    }
}
