package Logic1;
/*The number 6 is a truly great number. Given two int values, a and b,
return true if either one is 6. Or if their sum or difference is 6.
Note: the function Math.abs(num) computes the absolute value of a number. */

public class Love6 {
    public boolean love6(int a, int b) {
        int sum = a + b;
        int sum0 = a - b;
        if (a == 6 || b == 6 || sum == 6 || Math.abs(sum0)==6) {
            return true;
        }
        return false;
    }
}
