package Warmup1;
/*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

public class EveryNth {
    public String everyNth(String str, int n) {
        String ret = "";
        for (int i = n; i < str.length(); i+=n) {
            ret += str.charAt(i);
        }
        return str.charAt(0) + ret;
    }
}
