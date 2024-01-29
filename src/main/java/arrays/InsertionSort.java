package arrays;

public class InsertionSort {
    void arraySort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args){
        int a[]={7,9,5,1,0,9};
        int len = a.length;
        InsertionSort i=new InsertionSort();
        i.arraySort(a);
        for (int k = 0; k< len; k++)
            System.out.print(a[k] + " ");
        System.out.println();
    }
}
