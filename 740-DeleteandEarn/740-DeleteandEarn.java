// Last updated: 6/6/2026, 8:50:32 AM
1import java.util.*;
2
3class Solution {
4    public int deleteAndEarn(int[] nums) {
5        int max = 0;
6
7        // Step 1: find max value
8        for (int num : nums) {
9            max = Math.max(max, num);
10        }
11
12        // Step 2: build points array
13        int[] points = new int[max + 1];
14
15        for (int num : nums) {
16            points[num] += num;
17        }
18
19        // Step 3: House Robber DP
20        int prev2 = 0; // dp[i-2]
21        int prev1 = 0; // dp[i-1]
22
23        for (int i = 0; i <= max; i++) {
24            int take = points[i] + prev2;
25            int skip = prev1;
26
27            int curr = Math.max(take, skip);
28
29            prev2 = prev1;
30            prev1 = curr;
31        }
32
33        return prev1;
34    }
35}