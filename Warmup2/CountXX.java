package Warmup2;
//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

public class CountXX {
    int countXX(String str) {
        int count  = 0;
        for (int i = 0; i < str.length() -1 ; i++) {
            if (String.valueOf(str.charAt(i)).equals("x") && String.valueOf(str.charAt(i+1)).equals("x")) {
                count++;
            }
        }
        return count;
    }
}
