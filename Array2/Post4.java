package Array2;
/*Given a non-empty array of ints, return a new array containing the elements from the original array that come
after the last 4 in the original array. The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0. */

import java.util.Arrays;

public class Post4 {
    public int[] post4(int[] nums) {
        int newLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                newLength = i;
            }
        }
        int [] arr =  Arrays.copyOfRange(nums, newLength+1, nums.length);
        return arr;
    }
}
