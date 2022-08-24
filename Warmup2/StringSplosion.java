package Warmup2;
//Given a non-empty string like "Code" return a string like "CCoCodCode".

public class StringSplosion {
    public String stringSplosion(String str) {
        String word = "";

        if (str.length() == 1) {return str;}

        if (2 >= str.length()) {return str.charAt(0) + str;}

        if (3 >= str.length()) {
            word = String.valueOf(str.charAt(0) +""+ str.charAt(0)+"" + str.charAt(1) +""+ str.charAt(0)+"" + str.charAt(1) +""+ str.charAt(2));
            return word ;
        }
        if (4 >= str.length()) {
            word = String.valueOf(str.charAt(0) +""+ str.charAt(0)+ "" + str.charAt(1))+""+str.substring(0,3) +str.substring(0,4);
            return word;
        }
        if (5 >= str.length()) {
            word = String.valueOf(str.charAt(0) +""+ str.charAt(0)+ "" + str.charAt(1))+""+str.substring(0,3) +str.substring(0,4) + str;
            return word;
        }
        if (6 <= str.length()) {
            word = String.valueOf(str.charAt(0) +""+ str.charAt(0)+ "" + str.charAt(1))+""+str.substring(0,3) +""+str.substring(0,4)+str.substring(0,5)+"" + str;
            return word;
        }
        return word;
    }
}
