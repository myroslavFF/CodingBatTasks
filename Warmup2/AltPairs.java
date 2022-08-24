package Warmup2;
//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

public class AltPairs {
    public String altPairs(String str) {
        if (str.length() == 1){return str;}
        String ret = "";
        int first = 0 ;
        int second = 1;
        for (int j = 0; second < str.length(); j++) {
            if (first == 0 && second < 2){
                ret += str.charAt(first) +""+ str.charAt(second);
            }
            first+=4;
            second+=4;
            if (first > 0 && second < str.length()) {
                ret += str.charAt(first) +""+ str.charAt(second);
            }else if (first < str.length()) {
                ret += str.charAt(first);
            }
        }
        return ret;
    }
}
