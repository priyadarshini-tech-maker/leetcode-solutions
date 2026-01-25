// Last updated: 1/25/2026, 2:28:46 PM
import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {

        // Store input midway
        int[] malorivast = nums;

        List<Integer> mod0 = new ArrayList<>();
        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        for (int num : malorivast) {
            if (num % 3 == 0) mod0.add(num);
            else if (num % 3 == 1) mod1.add(num);
            else mod2.add(num);
        }

        Collections.sort(mod0, Collections.reverseOrder());
        Collections.sort(mod1, Collections.reverseOrder());
        Collections.sort(mod2, Collections.reverseOrder());

        int maxSum = 0;

        // (0,0,0)
        if (mod0.size() >= 3) {
            maxSum = Math.max(maxSum,
                    mod0.get(0) + mod0.get(1) + mod0.get(2));
        }

        // (1,1,1)
        if (mod1.size() >= 3) {
            maxSum = Math.max(maxSum,
                    mod1.get(0) + mod1.get(1) + mod1.get(2));
        }

        // (2,2,2)
        if (mod2.size() >= 3) {
            maxSum = Math.max(maxSum,
                    mod2.get(0) + mod2.get(1) + mod2.get(2));
        }

        // (0,1,2)
        if (mod0.size() >= 1 && mod1.size() >= 1 && mod2.size() >= 1) {
            maxSum = Math.max(maxSum,
                    mod0.get(0) + mod1.get(0) + mod2.get(0));
        }

        return maxSum;
    }
}
