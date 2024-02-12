package threads;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingleTonTest {
    @Test
    public void testSingleTon(){
        SingleTon s1=SingleTon.getInstance();
        SingleTon s2=SingleTon.getInstance();
        if(s1==s2){
            System.out.println("Both are having same memory location");
        }
        assertSame(s1,s2);
    }
}
