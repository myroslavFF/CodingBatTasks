package Warmup1;
/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.*/

import java.util.Locale;

public class EndUp {
    public String endUp(String str) {
        if (str.length() > 3) {
            String dd = str.substring(str.length()-3,str.length()).toUpperCase(Locale.ROOT);
            return str.substring(0,str.length()-3) + dd;
        }
        return str.toUpperCase();
    }
}
