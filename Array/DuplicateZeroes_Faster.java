package Array;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroes_Faster {
    static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = -1;
            if (!queue.isEmpty()) {
                temp = arr[i];
                arr[i] = queue.poll();
                queue.add(temp);
            }

            if (temp == 0 || (temp == -1 && arr[i] == 0))
                queue.add(0);
        }

        for (int n : arr)
            System.out.println(n);

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }
}
