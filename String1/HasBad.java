package String1;
/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
including 0. Note: use .equals() to compare 2 strings. */

public class HasBad {
    public boolean hasBad(String str) {
        if (str.isEmpty() || str.length() <= 2 || str.length() == 3 && !str.substring(0,3).equals("bad")) {
            return false;
        }
        if (str.length() >2 && str.substring(0,3).equals("bad") || str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
