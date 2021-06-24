package DuplicateZeroes;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroes_Queue {
    static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            // push additional 0 if arr[i] was zero
            if (arr[i] == 0)
                queue.add(0);

            arr[i] = queue.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }
}
