package Array2;
/*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array. You do not need a separate
if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code) */

public class FizzArray {
    public int[] fizzArray(int n) {
        if (n == 1) {
            return new int[]{0};
        }
        int [] nums = new int [n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
