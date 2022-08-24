package Array1;
/*Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value.
Return the changed array.*/

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int maxElement = nums[0];
        if (maxElement > nums[nums.length - 1]) {
            return new int [] {maxElement, maxElement, maxElement};
        }
        return new int [] {nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
    }
}
