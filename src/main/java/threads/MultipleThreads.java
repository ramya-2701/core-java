package threads;

public class MultipleThreads{
    public static void main(String[] args) {
        Runnable r1 = new OddNum();
        Runnable r2 = new EvenNum();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

    class OddNum implements Runnable {
        public void run() {
            for (int i = 1; i <= 60; i += 2) {
                System.out.println("Threadodd"+i);
            }
        }
    }

    class EvenNum implements Runnable {
        public void run() {
            for (int i = 0; i < 60; i += 2) {
                System.out.println("ThreadEven"+i);
            }
        }
    }

