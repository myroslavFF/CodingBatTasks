package String2;
/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/

public class ZipZap {
    public String zipZap(String str) {
        if (str.length() < 3) return str;
        if (str.equals("zzp")) return "zp";
        String ret = "";
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (i != temp) {
                ret += str.charAt(i);
            }
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                temp = i + 1;
            }
        }
        return ret;
    }
}
