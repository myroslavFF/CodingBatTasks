package Array1;
/*Given an array of ints of odd length, return a new array length 3 containing the elements
from the middle of the array. The array length will be at least 3.*/

public class MidThree {
    public int[] midThree(int[] nums) {
        if (nums.length > 4) {
            int temp = nums.length / 2;
            return new int [] {nums[temp - 1], nums[temp], nums[temp + 1]};
        }
        return nums;
    }
}
