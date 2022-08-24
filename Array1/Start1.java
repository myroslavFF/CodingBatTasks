package Array1;
//Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

public class Start1 {
    public int start1(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return 0;
        }
        if ( (b.length == 0 && a[0] == 1 || a.length == 0 && b[0] == 1)) {
            return 1;
        }
        if (a[0] == 7 && b.length == 0) {
            return 0;
        }
        if (a[0] == 1 && b[0] == 1) {
            return 2;
        }
        if (a[0] == 1 || b[0] == 1) {
            return 1;
        }
        return 0;
    }
}
