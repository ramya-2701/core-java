package exceptions;

public class StringtoIntegerExcp {
    public static int convertInteger(String s){
        int result=0;
        try{
            result=Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("Cannot convert this string to number :"+s);
        }
        return result;
    }

}
