package Warmup1;
/*Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.
*/
public class NearHundred {
    public boolean nearHundred(int n) {
        if (90 <= n && n <= 110 || 190 <= n && n <= 210) {
            return true;
        }
        return false;
    }
}
