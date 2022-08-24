package Array1;
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        return new int[] {nums[nums.length - 2],nums[nums.length - 1], nums[0]};
    }
}
