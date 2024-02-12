package threads;

import org.junit.Test;

public class DeadlockTest {
    @Test(timeout = 400)
    public void testDeadlock(){
        Deadlock.createDeadlock();
    }
}
