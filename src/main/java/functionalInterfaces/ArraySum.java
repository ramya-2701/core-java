package functionalInterfaces;

public class ArraySum {
    public static long sumOfArray(int[] arr){
        long add=0;
        for(int i=0;i<arr.length;i++){
            add+=arr[i];
        }
        System.out.println(add);
        return add;
    }
}
