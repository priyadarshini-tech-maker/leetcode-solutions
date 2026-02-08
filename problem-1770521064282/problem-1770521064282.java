// Last updated: 2/8/2026, 8:54:24 AM
1class Solution {
2    public int countMonobit(int n) {
3        int count = 0;
4        if(n >= 0) count++;
5        int num = 1;
6        while(num <= n) {
7            count++;
8            num = (num << 1) | 1;
9        }
10        return count;
11        
12        
13    }
14}