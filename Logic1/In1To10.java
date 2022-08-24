package Logic1;
/*Given a number n, return true if n is in the range 1..10, inclusive.
Unless outsideMode is true, in which case return true if the number is less or equal to 1,
or greater or equal to 10. */

public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if (n > 0 && n <= 10 && !outsideMode) {
            return true;
        }
        if (n >= 10 && outsideMode || n <= 1 && outsideMode) {
            return true;
        }
        return false;
    }
}
