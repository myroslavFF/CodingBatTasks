package Warmup2;
/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.*/

public class StringMatch {
    public int stringMatch(String a, String b) {
        int ind = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len -1; i++) {
            String str = a.substring(i, i + 2);
            String re  = b.substring(i, i + 2);
            if (str.equals(re)) {
                ind++;
            }
        }
        return ind;
    }
}
