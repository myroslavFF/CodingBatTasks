package Warmup2;
/*Given a string, return the count of the number of times that a substring length 2 appears in the string
and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).*/

public class Last2 {
    public int last2(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        String word = str.substring(str.length()-2);
        for (int i = 0; i < str.length()-2; i++) {
            String se = str.substring(i, i+2);
            if (word.equals(se)){
                count++;
            }
        }
        return count;
    }
}
