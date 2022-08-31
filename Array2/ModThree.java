package Array2;
//Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

public class ModThree {
    public boolean modThree(int[] nums) {
        int odd = 0;
        int nonOdd = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                odd++;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                nonOdd++;
            }
        }
        if (odd >= 1 || nonOdd >= 1) {
            return true;
        }
        return false;
    }
}
