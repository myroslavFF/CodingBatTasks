package Logic1;
/*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod*/

public class SpecialEleven {
    public boolean specialEleven(int n) {
        if (n == 0) {
            return true;
        }
        int a = n - 1;
        if (n % 11 == 0 && n > 0 || a % 11 == 0 && n > 0) {
            return true;
        }
        return false;
    }
}



