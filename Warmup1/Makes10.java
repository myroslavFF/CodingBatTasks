package Warmup1;
/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
public class Makes10 {
    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (sum == 10 || a == 10 || b == 10) {
            return true;
        }
        return false;
    }
}
