// Last updated: 1/25/2026, 2:28:45 PM
import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallestSum = 0;
        int largestSum = 0;

        for (int i = 0; i < k; i++) {
            smallestSum += nums[i];
            largestSum += nums[nums.length - 1 - i];
        }

        return Math.abs(largestSum - smallestSum);
    }
}

