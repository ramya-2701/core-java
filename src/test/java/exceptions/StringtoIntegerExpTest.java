package exceptions;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringtoIntegerExpTest {
    @Test
    public void testWithInteger(){
        String s="23";
        int i = StringtoIntegerExcp.convertInteger(s);
        assertSame(i,23);
    }
    @Test
    public void testWithFloat(){
        String s="45.67";
         int i = StringtoIntegerExcp.convertInteger(s);
        assertEquals(i,0);
    }
    @Test
    public void testWithString(){
        String s="test";
         int i = StringtoIntegerExcp.convertInteger(s);
        assertEquals(i,0);
    }
    @Test
    public void testWithAlphaNumeric(){
        String s="123f";
        int i = StringtoIntegerExcp.convertInteger(s);
        assertNotEquals(i,"123f");

    }

}
