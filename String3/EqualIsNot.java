package String3;
/*Given a string, return true if the number of appearances of "is" anywhere in the string is equal
to the number of appearances of "not" anywhere in the string (case sensitive). */


public class EqualIsNot {
    public boolean equalIsNot(String str) {
        String is = "is";
        String not = "not";
        int isCount = 0;
        int notCount = 0;
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + is.length()).equals(is)) {
                isCount++;
            }
            for (int j = 0; j < str.length() - 2; j++) {
                if (!flag && str.substring(j, j + not.length()).equals(not)) {
                    notCount++;
                }
            }
            flag = true;
        }
        return isCount == notCount;
    }
}
