package functionalInterfaces;

public class SwappingIntegers {
    public static int[] swapNumbers(int a,int b){
        System.out.println("before swapping a="+a+" b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a="+a+" b= "+b);
        return new int[]{a,b};
    }

}
