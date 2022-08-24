package Warmup1;
//Given a string, return true if the string starts with "hi" and false otherwise.

public class StartHi {
    public boolean startHi(String str) {
        String [] word = str.split(" ");
        if (word[0].equals("hi")) {
            return true;
        }
        return false;
    }
}
