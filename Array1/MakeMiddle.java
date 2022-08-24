package Array1;
/*Given an array of ints of even length, return a new array length 2 containing the middle two elements
from the original array. The original array will be length 2 or more. */

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        if (nums.length > 3) {
            int temp = nums.length / 2;
            return new int [] {nums[temp - 1], nums[temp]};
        }
        return nums;
    }
}
