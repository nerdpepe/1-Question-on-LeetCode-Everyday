import java.util.PriorityQueue;

public class ThirdMaximum {
    static int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(3, (a, b) -> {
            if (a < b)
                return 1;
            else
                return -1;
        });

        for (int n : nums)
            if (!pq.contains(n))
                pq.add(n);

        if (pq.size() < 3) {
            return pq.poll();
        }

        pq.poll();
        pq.poll();
        return pq.poll();
    }

    public static void main(String... arg) {
        int[] nums = new int[] { -2147483648, -2147483647, -2147483646 };
        System.out.println(thirdMax(nums));
    }
}
