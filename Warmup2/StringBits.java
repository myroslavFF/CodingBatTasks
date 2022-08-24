package Warmup2;
//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

public class StringBits {
    public String stringBits(String str) {
        String word = "";
        for (int i = 0; i < str.length(); i+=2) {
            word += str.charAt(i);
        }
        return word;
    }
}
