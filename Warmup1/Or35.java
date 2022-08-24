package Warmup1;
/*Return true if the given non-negative number is a multiple of 3
or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod*/

public class Or35 {
    public boolean or35(int n) {
        if (0 < n && n % 3 == 0 || 0 < n && n % 5 == 0) return true;
        return false;
    }

}
