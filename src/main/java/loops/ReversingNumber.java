package loops;

public class ReversingNumber {
    int reverse(int n){
        int rem;
        int num=0;
        while(n!=0){
           rem=n%10;
           num=num*10+rem;
           n=n/10;
        }
        return num;
    }
    public static void main(String[] args){
        ReversingNumber r=new ReversingNumber();
        System.out.println(r.reverse(12345));
    }
}
