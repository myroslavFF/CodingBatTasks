package Logic1;
/*Given three ints, a b c, return true if they are in strict increasing order,
such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true,
equality is allowed, such as 5 5 7 or 5 5 5. */

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c && !equalOk) {
            return true;
        }
        if (equalOk && b <= c && b >= a ) {
            return true;
        }
        return false;
    }
}
