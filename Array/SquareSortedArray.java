//import java.util.PriorityQueue;
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquareSortedArray {
    /*
     * public int[] sortedSquares(int[] nums) { PriorityQueue<Integer> pq = new
     * PriorityQueue<>();
     * 
     * for(int i : nums) pq.add(i*i);
     * 
     * int k = 0; while(!pq.isEmpty()) nums[k++] = pq.poll();
     * 
     * return nums; }
     */
    public int[] sortedSquares(int[] nums) {
        int j = nums.length - 1;
        int i = 0;
        int k = nums.length - 1;
        int[] arr = new int[nums.length];

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                arr[k--] = nums[i] * nums[i];
                i++;
            } else {
                arr[k--] = nums[j] * nums[j];
                j--;
            }
        }

        return arr;
    }
}
