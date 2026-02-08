// Last updated: 2/8/2026, 8:49:22 AM
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        double[] suffixSum = new double[n];
6        suffixSum[n-1] = nums[n-1];
7        for(int i=n-2;i>=0;i--) {
8            suffixSum[i] = suffixSum[i+1] + nums[i];
9        }
10        for(int i=0;i<n-1;i++) {
11            int elementsOnRight = n-i-1;
12            double rightAverage = suffixSum[i+1] / elementsOnRight;
13            if(nums[i] > rightAverage) {
14                count++;
15            }
16        }
17        return count;
18    }
19}