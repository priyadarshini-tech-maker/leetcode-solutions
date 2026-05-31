# Last updated: 5/31/2026, 5:30:56 PM
1class Solution:
2    def nextPermutation(self, nums):
3        n = len(nums)
4
5        # Find first decreasing element from right
6        i = n - 2
7        while i >= 0 and nums[i] >= nums[i + 1]:
8            i -= 1
9
10        # If found, find element just larger than nums[i]
11        if i >= 0:
12            j = n - 1
13            while nums[j] <= nums[i]:
14                j -= 1
15            nums[i], nums[j] = nums[j], nums[i]
16
17        # Reverse the suffix
18        left = i + 1
19        right = n - 1
20        while left < right:
21            nums[left], nums[right] = nums[right], nums[left]
22            left += 1
23            right -= 1