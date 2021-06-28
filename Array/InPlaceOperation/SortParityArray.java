package InPlaceOperation;

public class SortParityArray {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] % 2 == 1 && nums[j] % 2 == 1) {
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 == 0) {
                i++;
            } else {
                i++;
                j--;
            }

        }
        return nums;
    }
}
