package Warmup2;
//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

public class Array123 {
    public boolean array123(int[] nums) {
        boolean ret = false;
        if (nums.length < 3) return ret;
        for (int i = 0; i < nums.length-1; i++) {
            int two = i + 1;
            int three = i + 2;
            if (nums[i] == 1 && nums[two] == 2 && nums[three] == 3)ret = true;
        }
        return ret;
    }
}
