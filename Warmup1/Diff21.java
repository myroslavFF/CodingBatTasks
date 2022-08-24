package Warmup1;
/*Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
 */
public class Diff21 {
    public int diff21(int n) {
        int dif = 21 - n;
        if (21 < n) {
            dif = (n - 21) * 2;
        }
        return dif;
    }

}
