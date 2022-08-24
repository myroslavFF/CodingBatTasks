package String1;
/*Given a string, if the first or last chars are 'x',
return the string without those 'x' chars, and otherwise return the string unchanged. */

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() > 2 && str.substring(0, 1).equals("x") &&
            str.substring(str.length() - 1).equals("x")) {
            return str.substring(1,str.length() - 1);
        }
        if (str.length() > 2 && str.substring(0, 1).equals("x")) {
            return str.substring(1);
        }
        if (str.length() > 2 && str.substring(str.length() - 1).equals("x")) {
            return str.substring(0, str.length() - 1);
        }
        if (str.length() >= 2 && !str.substring(0, 1).equals("x") &&
            !str.substring(str.length() - 1).equals("x")) {
            return str;
        }
        return "";
    }
}
