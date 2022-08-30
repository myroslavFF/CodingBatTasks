package Array2;
/*Given an array length 1 or more of ints,
return the difference between the largest and smallest values in the array. */

public class BigDiff {
    public int bigDiff(int[] nums) {
        if (nums.length == 1) return 0;
        int max = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int tempMax = Math.max(nums[i], nums[i + 1]);
            if (nums[i] >= max) {
                max = tempMax;
            }
            int tempMin = Math.min(nums[i], nums[i + 1]);
            if (tempMin <= min) {
                min = tempMin;
            }
        }
        return max - min;
    }
}
