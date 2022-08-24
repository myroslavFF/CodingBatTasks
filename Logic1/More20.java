package Logic1;
//Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

public class More20 {
    public boolean more20(int n) {
        int i = n - 1;
        int j = n - 2;
        if (i % 20 == 0 || j % 20 == 0) {
            return true;
        }
        return false;
    }
}
