package Warmup1;
/*Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.*/

public class Front3 {
    public String front3(String str) {
        if (str.isEmpty()){return "";}
        if (str.length () == 1 || str.length () == 2) {return str + str +str;}
        if (str.length () == 2) {return str + str +str;}
        String [] word = str.split("");
        String backWord = "";
        for (int i = 0; i < 3; i++) {
            backWord +=word[i];
        }
        return backWord + backWord + backWord;
    }
}
