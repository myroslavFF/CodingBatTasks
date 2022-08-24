package Warmup2;
//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

public class DoubleX {
    boolean doubleX(String str) {
        if (str.length() == 1 || str.isEmpty() ) {
            return false;
        }
        if (String.valueOf(str.charAt(0)).equals("x") && String.valueOf(str.charAt(1)).equals("x")
         || String.valueOf(str.charAt(1)).equals("x") && String.valueOf(str.charAt(2)).equals("x")
        ) {
            return true;
        }
        return false;
    }
}
