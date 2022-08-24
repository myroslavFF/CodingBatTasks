package String1;
/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char,
then omit one of the chars, so "abc" and "cat" yields "abcat". */

public class ConCat {
    public String conCat(String a, String b) {
        if (a.isEmpty()){
            return b;
        }
        if (b.isEmpty()){
            return a;
        }
        if (a.substring(a.length()-1, a.length()).equals(b.substring(0, 1))){
            return a + b.substring(1);
        }
        return a + b;
    }
}
