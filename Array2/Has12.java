package Array2;
//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

public class Has12 {
    public boolean has12(int[] nums) {
        boolean isOne = false;
        boolean isTwo = false;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one = i;
                isOne = true;
            }
            if (nums[i] == 2) {
                two = i;
                isTwo = true;
            }
        }
        if (isOne && isTwo && one < two) {
            return true;
        }
        return false;
    }
}
