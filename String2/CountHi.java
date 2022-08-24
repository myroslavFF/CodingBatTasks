package String2;
//Return the number of times that the string "hi" appears anywhere in the given string.

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        char [] a = str.toCharArray();
        for(int i = 0; i < str.length() - 1; i++) {
            if(a[i] == 'h' && a[i+ 1] == 'i') {
                count++;
            }
        }
        return count;
    }
}
