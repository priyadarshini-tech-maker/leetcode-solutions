# Last updated: 3/1/2026, 8:53:05 AM
1class Solution(object):
2    def minCost(self, n):
3        """
4        :type n: int
5        :rtype: int
6        """
7        return n * (n - 1) // 2
8        