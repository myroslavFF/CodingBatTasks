package Warmup1;
//Given a string, return a new string where the first and last chars have been exchanged.

public class FrontBack {
    public String frontBack(String str) {
        String word = "";
        String [] arr = str.split("");
        String temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;
        for (String w: arr) {
            word += w;
        }
        return word;
    }
}
