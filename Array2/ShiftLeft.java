package Array2;
/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array. */

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) return nums;
        int [] newNum = new int[nums.length];
        newNum[nums.length - 1] = nums[0];
        int j = 0;
        for (int i = 1; i < newNum.length; i++) {
            newNum[j] = nums[i];
            j++;
        }
        return newNum;
    }
}
