package Warmup2;
//Given a string and a non-negative int n, return a larger string that is n copies of the original string.

public class StringTimes {
    public String stringTimes(String str, int n) {
        String word = "";
        for (int i = 0; i < n; i++) {
            word +=str;
        }
        return word;
    }
}
