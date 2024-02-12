package threads;

public class SingleTon {
    private static SingleTon instance;
    private static String data;
    private SingleTon(String data){
        this.data=data;
    }
    public static SingleTon getInstance(){
        synchronized (SingleTon.class) {
            if (instance == null) {
                instance = new SingleTon(data);
            }
        }
        return instance;
    }
}
