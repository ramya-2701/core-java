package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5,6,7};
        int x = 2;
        for(int i = 0; i < x; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}