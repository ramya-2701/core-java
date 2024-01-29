package loops;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int a = 0, b = 1;
        int temp;
        System.out.print(a + "  " + b + "  ");
        for (int i = 2; i < num; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + "  ");
        }

    }
}
