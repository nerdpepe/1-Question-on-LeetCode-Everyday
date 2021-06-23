// https://leetcode.com/problems/duplicate-zeros/

public class DuplicateZeroes_Solution {
    static void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for (int n : arr)
            if (n == 0)
                zeroCount++;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + zeroCount < arr.length)
                arr[i + zeroCount] = arr[i];

            if (arr[i] == 0) {
                --zeroCount;
                if (i + zeroCount < arr.length) {
                    arr[i + zeroCount] = arr[i];
                }
            }
        }

    } // end of duplicateZeroes

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }
}
