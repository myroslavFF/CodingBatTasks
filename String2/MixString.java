package String2;
/*Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result. */

public class MixString {
    public String mixString(String a, String b) {
        String ret = "";
        if (a.length() >= b.length()) {
            for (int i = 0; i < a.length(); i++) {
                ret += a.charAt(i);
                for (int j = i; j < b.length(); j++) {
                    ret += b.charAt(j);
                    break;
                }
            }
        }
        if (a.length() < b.length()) {
            for (int i = 0; i < b.length(); i++) {
                for (int j = i; j < a.length(); j++) {
                    ret += a.charAt(j);
                    break;
                }
                ret += b.charAt(i);
            }
        }
        return ret;
    }
}
