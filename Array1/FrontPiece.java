package Array1;
/*Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present. */

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            return new int [] {nums[0], nums[1]};
        }
        return nums;
    }
}
