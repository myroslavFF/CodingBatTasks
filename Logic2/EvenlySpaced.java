package Logic2;
/*Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is the same
as the difference between medium and large. */

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        if (a == b && a != c || b == c && b != a) {
            return false;
        }
        if (ab == ac || ab == bc || bc == ac) {
            return true;
        }
        return false;
    }
}
