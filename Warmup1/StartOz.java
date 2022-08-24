package Warmup1;
/*Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z',
 so "ozymandias" yields "oz".*/

public class StartOz {
    public String startOz(String str) {
        if (str.isEmpty() || (str.charAt(0) == 'z'
                && str.charAt(1) == 'o' && str.charAt(2) == 'o')) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        } else if (str.charAt(0) == 'z' && str.charAt(1) == 'o') {
            return "zo";
        } else if (str.charAt(0) == 'o' || str.charAt(1) == 'o') {
            return "o";
        } else if (str.charAt(0) == 'z' || str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }
}
