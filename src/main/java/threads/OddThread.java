package threads;

public class OddThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=60;i+=2){
            System.out.println("Odd Thread :"+i);
        }
    }
}
