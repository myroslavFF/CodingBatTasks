package String1;
/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length
as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.*/

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            int size = a.length() - b.length();
            return a.substring(size) + b;
        }
        if (b.length() > a.length()) {
            int size = b.length() - a.length();
            return a + b.substring(size);
        }return a + b;
    }
}
