package String1;
/*Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign". */

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() == 2) {
            return str.substring(1, 2) + str.substring(0, 1);
        }
        if (str.length() > 2) {
            String last = str.substring(str.length() - 2, str.length() - 1);
            String end = str.substring(str.length() - 1);
            return str.substring(0, str.length() - 2) + end + last;
        }
        if (str.length() == 1) {
            return str;
        }
        return "";
    }
}
