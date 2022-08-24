package Warmup1;
/*Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.
 */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 && negative || a > 0 && b < 0 && negative) {
            return false;
        }
        if ( a > 0 && b < 0 || a < 0 && b > 0 || a < 0 && b < 0 && negative) {
            return true;
        }
        return false;
    }
}
