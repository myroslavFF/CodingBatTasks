package Array2;
//Given an array of ints, return true if it contains no 1's or it contains no 4's.

public class No14 {
    public boolean no14(int[] nums) {
        if ( nums.length <= 1) return true;
        boolean isOne = false;
        boolean isFour = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                isOne = true;
            }
            if (nums[i] == 4) {
                isFour = true;
            }
        }
        if (isOne && !isFour || !isOne && isFour ) {
            return true;
        }
        return false;
    }
}
