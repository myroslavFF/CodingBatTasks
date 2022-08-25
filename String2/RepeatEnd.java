package String2;
/*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.*/

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String ret = "";
        int i = 0;
        while (i != n) {
            ret += str.substring(str.length() - n);
            i++;
        }
        return ret;
    }
}
