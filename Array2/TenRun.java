package Array2;
/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}. */

public class TenRun {
    public int[] tenRun(int[] nums) {
        boolean isMultiple = false;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                num = nums[i];
                isMultiple = true;
            }
            if (nums[i] % 10 != 0 && isMultiple) {
                nums[i] = num;
            }
        }
        return nums;
    }
}
