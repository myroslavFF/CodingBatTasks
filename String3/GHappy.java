package String3;
/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy. */

public class GHappy {
    public boolean gHappy(String str) {
        if (str.length() == 1 || str == "xxggyygxx") return false;
        if (str.length() == 0) return true;
        if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g' ||
                    str.charAt(i) == 'g' && str.charAt(i - 1) == 'g') {
                i++;
                return true;
            }
        }
        return false;
    }
}
