package Warmup1;
/*Return true if the given string begins with "mix", except the 'm' can be anything,
 so "pix", "9ix" .. all count.*/

public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() <= 2 ) {
            return false;
        }
        String a = str.substring(1, 3);
        if (!a.equals("ix")){
            return false;
        }
        return true;
    }
}
