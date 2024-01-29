package arrays;

public class ZeroAtEnd{
    public int[] relativeOrder(int[] arr)
    {
        int n = arr.length;
        int temp[] = new int[n];
        int count = 0;
        int j=0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i]!= 0)
            {
                temp[j] = arr[i];
                j++;
            }
            else
            {
                count++;
            }
        }

        while(count!= 0)
        {
            temp[j] = 0;
            j = j + 1;
            count--;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(temp[i] + " ");
        }
        return temp;
    }
    public static void main(String[] args)
    {
        ZeroAtEnd Z = new ZeroAtEnd();
        int arr[] = {1,2,0,3,0,4,0,0,9,6};
        Z.relativeOrder(arr);
    }
}
