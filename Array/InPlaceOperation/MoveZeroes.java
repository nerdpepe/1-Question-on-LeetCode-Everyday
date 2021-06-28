//https://leetcode.com/problems/move-zeroes
package InPlaceOperation;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0)
                nums[pos++] = nums[k];
        }

        while (pos < nums.length)
            nums[pos] = 0;
    }
}
