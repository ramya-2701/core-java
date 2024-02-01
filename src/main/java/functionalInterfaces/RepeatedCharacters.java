package functionalInterfaces;
public class RepeatedCharacters {
        public static String characterRepetation(String str) {
            StringBuilder repeatedCharactersBuilder = new StringBuilder();
            char[] carray = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (carray[i] == carray[j]) {
                        System.out.print(carray[i]+" ");
                        break;
                    }
                }
            }
            return repeatedCharactersBuilder.toString().trim();
    }
}
