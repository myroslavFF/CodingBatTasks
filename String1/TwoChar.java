package String1;
/*Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.
 */

public class TwoChar {
    public String twoChar(String str, int index) {
        int ind = index;
        if (index + 1 < str.length() && index > 0) {
            return str.substring(ind,ind + 2);
        }else {
            return str.substring(0,2);
        }
    }
}
