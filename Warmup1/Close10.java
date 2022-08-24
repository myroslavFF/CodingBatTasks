package Warmup1;
/*Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.*/

public class Close10 {
    public int close10(int a, int b) {
        int num = 0;
        int A = 10 - a;
        int B = 10 - b;
        if (A > B && Math.abs(A) != Math.abs(B)) {
            num = a;
        }
        if (B > A && Math.abs(A) != Math.abs(B)) {
            num = b;
        }
        return num;
    }
}
