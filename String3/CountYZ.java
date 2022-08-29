package String3;
/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z'
in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. */

import java.util.Locale;

public class CountYZ {
    public int countYZ(String str) {
        str = str.toLowerCase(Locale.ROOT) + 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    boolean flag = Character.isLetter(str.charAt(j));
                    if (!flag && str.charAt(j-1) == 'z' || !flag && str.charAt(j-1) == 'y') {
                        i = j -1;
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
