package arrays;

public class ReversingArray {
    public static void main(String[] args){
        int arr[]={3,5,6,4,7};
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
        }
        for(int k=0;k<n;k++){
            System.out.print(" "+temp[k]);
        }
    }
}
