// https://leetcode.com/problems/check-if-n-and-its-double-exist/
package SearchInArray;

import java.util.HashSet;

public class CheckNumAndDouble_Other {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hset.contains(arr[i] * 2))
                return true;

            if (arr[i] % 2 == 0)
                if (hset.contains(arr[i] / 2))
                    return true;

            hset.add(arr[i]);
        }
        return false;
    }
}
