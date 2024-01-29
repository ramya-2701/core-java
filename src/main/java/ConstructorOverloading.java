class Vechile{
    int x;
    public Vechile(int x) {
        this.x = x;
    }
}
class Car extends Vechile {
    int y;
    public Car(int x, int y) {
        super(x);
        this.y = y;
    }
public Car(int y) {
        this(0, y);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car c = new Car(6, 4);
        Car c1 = new Car(5);
        System.out.println("No of people in Vechile= " + c.x + ", No of people in car = " + c.y);
        System.out.println("No of people in Vechile = " + c1.x + ", No of people in car= " + c1.y);
    }
}
