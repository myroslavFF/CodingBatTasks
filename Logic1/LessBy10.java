package Logic1;
//Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        int ab = a - b;
        int bc = b - c;
        int ac = a -c;
        if (Math.abs(ab) >= 10 || Math.abs(bc) >= 10 || Math.abs(ac) >= 10) {
            return true;
        }
        return false;
    }
}
