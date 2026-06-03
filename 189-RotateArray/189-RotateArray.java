// Last updated: 6/3/2026, 10:59:28 AM
1class Solution {
2
3    public void reverse(int[] nums, int start, int end) {
4        while (start < end) {
5            int temp = nums[start];
6            nums[start] = nums[end];
7            nums[end] = temp;
8
9            start++;
10            end--;
11        }
12    }
13
14    public void rotate(int[] nums, int k) {
15        int n = nums.length;
16
17        k = k % n;
18
19        reverse(nums, 0, n - 1);
20        reverse(nums, 0, k - 1);
21        reverse(nums, k, n - 1);
22    }
23}