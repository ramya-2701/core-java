package streams;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Addition {
    public static int addNumbers(int x,int y) {
        MathOperation z = (a, b) -> a+b;
        int result = z.operate(x,y);
        System.out.println("Result of addition: " + result);
        return result;
    }
}
