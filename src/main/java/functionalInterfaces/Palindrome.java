package functionalInterfaces;

public class Palindrome {
    public static boolean isPalindrome(int x){
        int num=x;
        int rev=0;
        int rem;
        while(x>0){
          rem=x%10;
          rev=rev*10+rem;
          x=x/10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }
}
