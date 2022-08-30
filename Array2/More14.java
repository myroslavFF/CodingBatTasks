package Array2;
//Given an array of ints, return true if the number of 1's is greater than the number of 4's

public class More14 {
    public boolean more14(int[] nums) {
        int countFour = 0;
        int countOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                countFour++;
            } else if (nums[i] == 1) {
                countOne++;
            }
        }
        if (countOne > countFour) {
            return true;
        }
        return false;
    }
}
