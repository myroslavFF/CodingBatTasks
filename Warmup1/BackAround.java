package Warmup1;
/*Given a string, take the last char and return a new string with the last char
added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 */

public class BackAround {
    public String backAround(String str) {
        String [] word = str.split("");
        String ar = word[word.length - 1];
        return ar + str + ar ;
    }
}
