# Last updated: 5/24/2026, 8:33:42 AM
1class Solution(object):
2    def limitOccurrences(self, nums, k):
3        """
4        :type nums: List[int]
5        :type k: int
6        :rtype: List[int]
7        """
8        result = []
9        count = {}
10        for num in nums:
11            if num not in count:
12                count[num]=0
13            if count[num]<k:
14                    result.append(num)
15                    count[num] += 1
16        return result
17        