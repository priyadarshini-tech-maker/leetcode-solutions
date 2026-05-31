# Last updated: 5/31/2026, 5:19:38 PM
1class Solution:
2    def merge(self, nums1, m, nums2, n):
3        i = m - 1          # Last valid element in nums1
4        j = n - 1          # Last element in nums2
5        k = m + n - 1      # Last position in nums1
6
7        while i >= 0 and j >= 0:
8            if nums1[i] > nums2[j]:
9                nums1[k] = nums1[i]
10                i -= 1
11            else:
12                nums1[k] = nums2[j]
13                j -= 1
14            k -= 1
15
16        # Copy remaining elements from nums2 if any
17        while j >= 0:
18            nums1[k] = nums2[j]
19            j -= 1
20            k -= 1