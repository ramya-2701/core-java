package functionalInterfaces;

public class StringRotation {
    public static boolean isRotation(String s, String s1) {
        if (s == null || s1 == null) {
            return false;
        }
        if (s.length() == s1.length()) {
            String s3 = s + s;
            return s3.contains(s1);

        } else {
            return false;
        }
    }
}
