package Warmup2;
/*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4. */

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        boolean count = false;
        int a = 0;
        if (0== nums.length) {return false;}
        if (2 >= nums.length && nums[0] == 9) {return true;}
        if (nums.length > 4) {
            for (int i =0; i < 4; i++) {
                if (nums[i] == 9) {a++;}
                if (i == 3 && a == 0){return false;}
            }
        }
        for (int i =0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count = true;

            }
        }
        return count;
    }
}
