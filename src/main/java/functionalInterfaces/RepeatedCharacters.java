package functionalInterfaces;
public class RepeatedCharacters {
        public static String characterRepetition(String str) {
            StringBuilder repeatedCharactersBuilder = new StringBuilder();
            char[] carray = str.toCharArray();
            String s="";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (carray[i] == carray[j]) {
                        s+=carray[i];
                        break;
                    }
                }
            }
            return s;
    }
}
