package String2;
/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string. */

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String ret = "";
        for (int i = 0; i < count; i++) {
            ret += word;
            for (int j = i; j < count - 1; j++) {
                ret += sep;
                break;
            }
        }
        return ret;
    }
}
