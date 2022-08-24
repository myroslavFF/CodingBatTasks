package Array1;
//Given an int array length 2, return true if it contains a 2 or a 3.

public class Gas23 {
    public boolean has23(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        if (first == 2 || first == 3 || second == 2 || second == 3) {
            return true;
        }
        return false;
    }
}
