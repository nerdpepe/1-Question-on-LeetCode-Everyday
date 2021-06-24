package MergeSortedArray;
// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArr {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m + n - 1;
        m--;
        n--;
        while (n >= 0) {
            if (m < 0 || nums2[n] > nums1[m])
                nums1[pos--] = nums2[n--];
            else
                nums1[pos--] = nums1[m--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 5, 6, 7, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
    }

}