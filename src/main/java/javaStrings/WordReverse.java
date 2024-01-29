package javaStrings;
import java.lang.StringBuffer;
public class WordReverse {
    public static void main(String[] args) {
        String s="Java J2EE Reverse Me";
        stringReverse(s);
    }
        public static String[] stringReverse(String s){
        if(s==null|| s.isEmpty()){
            System.out.println("String empty");

        }
        String[] s1=s.split("\\s");
        for(int i=0;i<s1.length;i++) {
            StringBuffer sb = new StringBuffer(s1[i]);
            System.out.println(sb.reverse());
            s1[i]=sb.toString();
            System.out.print(s1[i]+" ");
        }
            String s2 = s1.toString();
            return s1;
    }
}
