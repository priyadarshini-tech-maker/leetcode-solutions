// Last updated: 2/1/2026, 3:01:17 PM
1class Solution {
2    public int climbStairs(int n) {
3
4        int arr[] = new int[n + 1];
5
6        arr[0] = 1;
7        arr[1] = 1;
8
9        for(int i = 2; i <= n; i++) {
10            arr[i] = arr[i-1] + arr[i-2];
11        }
12
13        return arr[n];
14    }
15}
16