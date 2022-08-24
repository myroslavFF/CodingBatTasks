package Warmup2;
/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples. */

public class NoTriples {
    public boolean noTriples(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            if (num == nums[i + 1]) {
                count++;
            }
        }
        if (count == 3 || count >= 3 || count == 2 && nums.length == 3){
            return false;
        }
        return true;
    }
}
