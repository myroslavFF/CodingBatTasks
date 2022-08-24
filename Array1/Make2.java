package Array1;
/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
the elements from a followed by the elements from b. The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays. */

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        if (a.length ==0 && b.length >= 1) {
            return new int [] {b[0], b[1]};
        }
        if (a.length == 1 && b.length >= 1) {
            return new int [] {a[0], b[0]};
        }
        return new int [] {a[0], a[1]};
    }
}
