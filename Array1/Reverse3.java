package Array1;
/*Given an array of ints length 3, return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}.*/

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int [] ret = new int[nums.length];
        int ind = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (ind <= nums.length - 1) {
                ret[ind] = nums[i];
                ind++;
            }
        }
        return new int [] {nums[nums.length - 1], nums[nums.length - 2], nums[nums.length - 3]};
    }
}
