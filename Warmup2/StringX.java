package Warmup2;
/*Given a string, return a version where all the "x" have been removed.
 Except an "x" at the very start or end should not be removed.*/

public class StringX {
    public String stringX(String str) {
        String remove = "";
        if (str.length() == 1)return str;
        if (str.isEmpty()) return "";
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i + 1);
            if (!str.substring(i,i+1).equals("x"))remove+=letter;
        }
        if (str.charAt(0)=='x'){
            String a = "";
            boolean x = str.substring(str.length() - 1).equals("x");
            if (str.substring(0, 1).equals("x") && x) {
                return str.substring(0, 1) + remove + str.substring(str.length() - 1);
            } else if (str.substring(0, 1).equals("x")) {
                return str.substring(0, 1) + remove;
            } else if (x) {
                return remove + str.substring(str.length() - 1);
            }
        }
        return remove;
    }
}
