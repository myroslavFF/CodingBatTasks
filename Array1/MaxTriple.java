package Array1;
/*Given an array of ints of odd length, look at the first, last,
and middle values in the array and return the largest. The array length will be a least 1. */

public class MaxTriple {
    public int maxTriple(int[] nums) {
        if (nums.length > 4) {
            int first = nums[0];
            int middle = nums[nums.length / 2];
            int last = nums[nums.length - 1];
            int max1 = Math.max(first, middle);
            return Math.max(max1,last);
        }
        int max = Math.max(nums[0], nums[1]);
        return Math.max(max, nums[2]);
    }
}
