package threads;

import org.junit.Test;

public class EvenOddTest {
    @Test
    public void testMultipleThreads(){
        EvenThread et=new EvenThread();
        OddThread ot=new OddThread();
        Thread eThreadObj=new Thread(et);
        Thread oThreadObj=new Thread(ot);
        eThreadObj.start();
        oThreadObj.start();

        try {
            eThreadObj.join();
            oThreadObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
