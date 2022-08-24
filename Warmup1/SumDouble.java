package Warmup1;
/*Given two int values, return their sum.
Unless the two values are the same, then return double their sum.*/
public class SumDouble {
    public int sumDouble(int a, int b) {
        int sum;
        sum = a + b;
        if (a == b) {
            sum = (a * 2) + (b * 2);
        }
        return sum;
    }
}
