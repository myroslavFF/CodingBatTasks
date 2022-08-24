package String2;
//Given a string, return a string where for every char in the original, there are two chars.

public class DoubleChar {
    public String doubleChar(String str) {
        String ret = "";
        for (int i = 0; i < str.length() ; i++) {
            ret += str.substring(i, i+1) + str.substring(i, i+1);
        }
        return ret;
    }
}
