package arrays;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int arr[] = {80,10, 40, 50, 30, 20};
        int small_num = arr[0];
        int large_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large_num)
                large_num = arr[i];
            else if (arr[i] < small_num)
                small_num = arr[i];
        }
        System.out.println("Largest Number: " + large_num);
        System.out.println("Smallest Number: " + small_num);
    }
}