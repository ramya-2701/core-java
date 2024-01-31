package functionalInterfaces;
public class FactorialNumber {
    public static long factorial(long x){
        if(x<0){
            System.out.println("x value should be >=0");
        }
        else if(x==0||x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
        return x;
    }
}
