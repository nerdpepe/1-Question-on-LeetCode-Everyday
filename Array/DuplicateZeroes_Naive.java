package Array;

// time complexity : O(n^2)

public class DuplicateZeroes_Naive {

    static void insertZeroAt(int pos, int arr[]) {
        for (int j = arr.length - 2; j >= pos; j--) {
            arr[j + 1] = arr[j];
        }
        arr[pos] = 0;
    }

    static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                insertZeroAt(i + 1, arr);
                i++;
            }
        }

        /*
         * for(int n : arr) System.out.println(n);
         */
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        duplicateZeros(arr);
    }
}