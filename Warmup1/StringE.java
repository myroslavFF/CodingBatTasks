package Warmup1;
//Return true if the given string contains between 1 and 3 'e' chars.

public class StringE {
    public boolean stringE(String str) {
        if (str.isEmpty()) return false;
        if (String.valueOf(str.charAt(0)).equals("e")) return true;
        if (!String.valueOf(str.charAt(1)).equals("e") || str.length() > 6) return false;
        String a = String.valueOf(str.charAt(1));
        if (a.equals("e")) {
            return true;
        }
        String b = String.valueOf(str.charAt(2));
        if (b.equals("e")) {
            return true;
        }
        String c = String.valueOf(str.charAt(3));
        if (c.equals("e")) {
            return true;
        }
        return false;
    }
}
