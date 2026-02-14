// Last updated: 2/14/2026, 8:40:35 PM
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        int n = nums.length;
4        if(n == 0) return  0;
5        if(n == 1) return nums[0];
6        long prev2 = 0;
7        long prev1 = nums[0];
8        for(int i=1;i<n;i++) {
9            long take;
10
11            if(colors[i] == colors[i-1]) {
12                take = prev2 + nums[i];
13            }else{
14                take = prev1 + nums[i];
15            }
16            long skip = prev1;
17            long current = Math.max(skip, take);
18            prev2 = prev1;
19            prev1 = current;
20        }
21        return prev1;
22        
23    }
24}