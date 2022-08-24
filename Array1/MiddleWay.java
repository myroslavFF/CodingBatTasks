package Array1;
//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        int midA = a.length / 2;
        int midB = b.length / 2;
        return new int [] {a[midA], b[midB]};
    }
}
