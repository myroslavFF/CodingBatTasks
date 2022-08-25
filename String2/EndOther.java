package String2;
/*Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.*/
import java.util.Locale;

public class EndOther {
    public boolean endOther(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        int aLen = Math.abs(a.length() - b.length());
        int bLen = Math.abs(b.length() - a.length());
        if (a.length() > b.length()) {
            return a.toLowerCase(Locale.ROOT).substring(aLen).equals(b.toLowerCase(Locale.ROOT));
        }
        if (b.length() > a.length()) {
            return b.toLowerCase(Locale.ROOT).substring(bLen).equals(a.toLowerCase(Locale.ROOT));
        }
        return false;
    }
}
