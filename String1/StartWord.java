package String1;
/*Given a string and a second "word" string, we'll say that the word matches the string
if it appears at the front of the string, except its first char does not need to match exactly.
On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
The word will be at least length 1. */

public class StartWord {
    public String startWord(String str, String word) {
        int len = word.length();
        if (str.length() < word.length() || str.length() == 1  && word.length() < 1 || str.isEmpty()) {
            return "";
        }
        if (str.substring(0, len).equals(word)){
            return str.substring(0, len);
        }
        if (str.substring(1,len).equals(word.substring(1))){
            return str.substring(0, 1) + word.substring(1);
        }
        return "";
    }
}
