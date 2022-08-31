package Array2;
//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public class Either24 {
    public boolean either24(int[] nums) {
        boolean isTwo =  false;
        boolean isFour =  false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                isTwo = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                isFour = true;
            }
        }
        return isTwo && !isFour || !isTwo && isFour;
    }
}
