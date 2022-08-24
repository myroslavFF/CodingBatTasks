package Warmup1;
//Given three int values, a b c, return the largest.

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = 0 ;
        if (a >= b && a >= c) {max = a;}
        if (b >= a && b >= c) {max = b;}
        if (c > b && c > a) {max = c;}
        return max;
    }
}
